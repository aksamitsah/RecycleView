package me.aksamitsah.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    myAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myAdapter(dataqueue());
        recyclerView.setAdapter(adapter);
    }
    public ArrayList<Model> dataqueue(){

        ArrayList<Model> data = new ArrayList<>();
        data.add(new Model("Java",R.drawable.ic_launcher_background));
        data.add(new Model("C++",R.drawable.ic_launcher_background));
        data.add(new Model("Orackle",R.drawable.ic_launcher_background));
        data.add(new Model("Obstract",R.drawable.ic_launcher_background));

        return data;

    }
}