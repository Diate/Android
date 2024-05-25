package com.example.luckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    TextView random;
    Button buttonShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textView = findViewById(R.id.textView3);
        buttonShare = findViewById(R.id.btnShare);
        random = findViewById(R.id.result);

        Intent intent = getIntent();
        String receivedValue = intent.getStringExtra("key");
        textView.setText(receivedValue);
        int randomnumber = generateRandom();
        random.setText(String.valueOf(randomnumber));
        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Hello, "+receivedValue+" .Share your number "+ randomnumber);
                intent.setType("text/plain");


                String[] recipients = {"phuongquynh191001@gmail.com"}; // Specify recipients here
                String subject = "Subject of the email";
                String content = "Hello, "+ receivedValue+" .Share your number "+ String.valueOf(randomnumber);
                intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, content);


                // Start the activity to show the share dialog
                startActivity(Intent.createChooser(intent, "Share via"));
            }
        });
    }
    int generateRandom()
    {
        Random random = new Random();
        return random.nextInt(1000);
    }
}