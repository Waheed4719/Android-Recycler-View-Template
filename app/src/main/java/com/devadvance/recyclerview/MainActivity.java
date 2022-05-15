package com.devadvance.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model> posts = new ArrayList<Model>();
    RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(this,  posts);
        recyclerView.setAdapter(adapter);
        insertData();
    }

    private void insertData() {

        posts.add(new Model("Hello World", "This is the description"));
        posts.add(new Model("Hello World 2", "This is the description 2"));
        posts.add(new Model("Hello World 3", "This is the description 3"));
        posts.add(new Model("Hello World 4", "This is the description 4"));
        posts.add(new Model("Hello World 5", "This is the description 5"));
        posts.add(new Model("Hello World 6", "This is the description 6"));
        adapter.notifyDataSetChanged();
    }
}