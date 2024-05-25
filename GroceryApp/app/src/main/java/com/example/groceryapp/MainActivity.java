package com.example.groceryapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.adapter.myAdapter;
import com.example.groceryapp.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Item> itemList;
    @SuppressLint("MissingInflatedId")
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
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView = findViewById(R.id.recv);
        itemList = new ArrayList<>();
        itemList.add(new Item("Xin Chao a","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        itemList.add(new Item("Xin Chao b","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"));
        itemList.add(new Item("Xin Chao v","ccccccccccccccccccccccccccccccccccccc"));
        itemList.add(new Item("Xin Chao d","ddddddddddddddddddddddddddddddddddddd"));
        itemList.add(new Item("Xin Chao e","eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"));
        itemList.add(new Item("Xin Chao f","fffffffffffffffffffffffffffffffffffff"));
        itemList.add(new Item("Xin Chao g","ggggggggggggggggggggggggggggggggggggg"));
        itemList.add(new Item("Xin Chao h","hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
        itemList.add(new Item("Xin Chao k","kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk"));
        itemList.add(new Item("Xin Chao a","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        itemList.add(new Item("Xin Chao b","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"));
        itemList.add(new Item("Xin Chao v","ccccccccccccccccccccccccccccccccccccc"));
        itemList.add(new Item("Xin Chao d","ddddddddddddddddddddddddddddddddddddd"));
        itemList.add(new Item("Xin Chao e","eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"));
        itemList.add(new Item("Xin Chao f","fffffffffffffffffffffffffffffffffffff"));
        itemList.add(new Item("Xin Chao g","ggggggggggggggggggggggggggggggggggggg"));
        itemList.add(new Item("Xin Chao h","hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
        itemList.add(new Item("Xin Chao k","kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk"));
        myAdapter adapter = new myAdapter(itemList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}