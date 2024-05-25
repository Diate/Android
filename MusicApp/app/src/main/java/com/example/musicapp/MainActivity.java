package com.example.musicapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnintro,btnOne,btnTwo;
    boolean isPlay = false;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnintro = findViewById(R.id.intro);
        btnOne = findViewById(R.id.one);
        btnTwo = findViewById(R.id.two);

        btnintro.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int idclick = v.getId();
        if (idclick == R.id.intro)
        {

            playMusic(R.raw.first);
        }
        else if (idclick == R.id.one)
        {
            playMusic(R.raw.second);
        }
        else {
            playMusic(R.raw.third);
        }
    }

    public void playMusic(int id)
    {
        if (isPlay)
        {
            mediaPlayer.stop();
//            if (mediaPlayer != null) {
//                mediaPlayer.release();
//                mediaPlayer = null;
//            }
        }
        mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        isPlay = true;
        mediaPlayer.start();

    }
}