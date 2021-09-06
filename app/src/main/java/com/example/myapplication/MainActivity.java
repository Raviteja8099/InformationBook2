package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ModalClass> modalList;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        modalList=new ArrayList<>();
        modalList.add(new ModalClass("countries","The Countries"));
        modalList.add(new ModalClass("leaders","The Leaders"));
        modalList.add(new ModalClass("museums","The Museums"));
        modalList.add(new ModalClass("wonders","Seven Wonders Of the World"));
        adapter=new CustomAdapter(modalList,this);
        recyclerView.setAdapter((adapter));
    }
}