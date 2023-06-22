package com.example.arabic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.arabic.Model.ImageItem;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViews extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private List<ImageItem> imageItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_views);

        // Initialize the RecyclerView and its layout manager
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Create your data list (List<ImageItem>) with the necessary data
        imageItems = new ArrayList<>();
        imageItems.add(new ImageItem(R.drawable.a1, " ألف في أول الكلمة "));
        imageItems.add(new ImageItem(R.drawable.a2, " ألف في وسط الكلمة "));
        imageItems.add(new ImageItem(R.drawable.a3, " ألف في آخر الكلمة متصلة "));
        imageItems.add(new ImageItem(R.drawable.a4, " ألف في آخر الكلمة منفصلة "));
        // Add more items as needed

        // Initialize your adapter and pass the data list
        adapter = new Adapter(this, imageItems);

        // Set the adapter to the RecyclerView
        recyclerView.setAdapter(adapter);
    }
}

