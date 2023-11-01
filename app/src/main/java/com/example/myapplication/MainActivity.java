package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.Adapters.RecipeAdapter;
import com.example.myapplication.Classess.RecyclerItemClickListener;
import com.example.myapplication.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList <RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.f1,"burger"));
        list.add(new RecipeModel(R.drawable.f2,"burger"));
        list.add(new RecipeModel(R.drawable.f3,"burger"));
        list.add(new RecipeModel(R.drawable.f4,"burger"));
        list.add(new RecipeModel(R.drawable.f5,"burger"));
        list.add(new RecipeModel(R.drawable.f6,"burger"));
        list.add(new RecipeModel(R.drawable.f7,"burger"));
        list.add(new RecipeModel(R.drawable.f8,"burger"));
        list.add(new RecipeModel(R.drawable.f8,"burger"));
        list.add(new RecipeModel(R.drawable.f8,"burger"));
        list.add(new RecipeModel(R.drawable.f8,"burger"));
        list.add(new RecipeModel(R.drawable.f8,"burger"));
        list.add(new RecipeModel(R.drawable.f8,"burger"));
        list.add(new RecipeModel(R.drawable.f8,"burger"));

        RecipeAdapter adapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

         LinearLayoutManager layoutManager = new LinearLayoutManager(this);
         recyclerView.setLayoutManager(layoutManager);

     //   LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
       // recyclerView.setLayoutManager(layoutManager);

       // GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        //recyclerView.setLayoutManager(gridLayoutManager);

       // StaggeredGridLayoutManager staggered = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
        //recyclerView.setLayoutManager(staggered);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                this
                , recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent i = new Intent(MainActivity.this,ScrollingActivity.class);
                        startActivity(i);
                        break;

                    case 1:
                        Toast.makeText(MainActivity.this,"Second item is clicked",Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this,"third item is Clicked",Toast.LENGTH_SHORT).show();
                        break;

                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this,"set 10% discount",Toast.LENGTH_SHORT).show();
                        break;

                    default:
                }
            }
        }

        ));

    }
}