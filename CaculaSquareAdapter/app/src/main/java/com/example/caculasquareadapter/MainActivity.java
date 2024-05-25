package com.example.caculasquareadapter;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Shape> shapeListView;

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

        GridView gridView = findViewById(R.id.grid);
        shapeListView = new ArrayList<>();
        Shape shape1 = new Shape("Vuong",R.drawable.jupiter);

        Shape shape2 = new Shape("Tron",R.drawable.mars);

        Shape shape3 = new Shape("Tam giac",R.drawable.mercury);

        Shape shape4 = new Shape("Tron",R.drawable.neptune);


        shapeListView.add(shape1);
        shapeListView.add(shape2);
        shapeListView.add(shape3);
        shapeListView.add(shape4);

        CustomAdapter adapter = new CustomAdapter(shapeListView,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


    }
}