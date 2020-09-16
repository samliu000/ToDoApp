package com.example.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> items;

    Button addButton;
    EditText editText;
    RecyclerView allItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.buttonAdd);
        editText = findViewById(R.id.editItem);
        allItems = findViewById(R.id.allItems);

        items = new ArrayList<>();
        items.add("Buy milk");
        items.add("Go to gym");
        items.add("Have fun");

        ItemsAdapter itemsAdapter = new ItemsAdapter(items);
        allItems.setAdapter(itemsAdapter);
        allItems.setLayoutManager(new LinearLayoutManager(this));

    }
}