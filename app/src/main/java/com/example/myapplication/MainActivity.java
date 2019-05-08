package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        String[] Dataset= {"Rishabh","shrey","yuvraj","sure","sum","rish","item1","shrey","yuvraj","sure","sum","rish","item1","shrey","yuvraj","sure","sum","rish","item1","shrey","yuvraj","sure","sum","rish","item1","rishabh","shrey","yuvraj","sure","sum","rish","item1","shrey","yuvraj","sure","sum","rish","item1","shrey","yuvraj","sure","sum","rish","item1","shrey","yuvraj","sure","sum","rish","item1","rishabh","shrey","yuvraj","sure","sum","rish","item1","shrey","yuvraj","sure","sum","rish","item1","shrey","yuvraj","sure","sum","rish","item1","shrey","yuvraj","sure","sum","rish","item1"};
        adapter=new MyAdapter(Dataset);
        recyclerView.setAdapter(adapter);

    }
}
