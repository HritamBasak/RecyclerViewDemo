package com.example.recyclerviewdemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import Adapter.AdapterClass;
import Classes.RecyclerViewItemClickListener;
import Model.ModelRecipe;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.sample_recyclerview);
//        recyclerView=findViewById(R.id.recyclerView);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView=findViewById(R.id.recyclerView);
        ArrayList<ModelRecipe> listfoods=new ArrayList<>();
        listfoods.add(new ModelRecipe(R.drawable.butternun,"Butter Nun"));
        listfoods.add(new ModelRecipe(R.drawable.cakeandsamosa,"Cake and Samosa"));
        listfoods.add(new ModelRecipe(R.drawable.chickenwings,"Chicken Wings"));
        listfoods.add(new ModelRecipe(R.drawable.chocolates,"Chocolates"));
        listfoods.add(new ModelRecipe(R.drawable.tea,"Tea"));
        listfoods.add(new ModelRecipe(R.drawable.maggie,"Maggie"));
        listfoods.add(new ModelRecipe(R.drawable.misti,"Sweets"));
        listfoods.add(new ModelRecipe(R.drawable.pattis,"Patties"));
        listfoods.add(new ModelRecipe(R.drawable.rajpapri,"Rajpapri"));
        listfoods.add(new ModelRecipe(R.drawable.rasmalai,"Rasmalai"));


        AdapterClass adapterClass=new AdapterClass(listfoods,MainActivity.this);
        recyclerView.setAdapter(adapterClass);

//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
//        recyclerView.setLayoutManager(linearLayoutManager);

          GridLayoutManager gridLayoutManager=new GridLayoutManager(MainActivity.this,2);
          recyclerView.setLayoutManager(gridLayoutManager);

//        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);

          recyclerView.addOnItemTouchListener(new RecyclerViewItemClickListener(this, recyclerView, new RecyclerViewItemClickListener.OnItemClickListener() {
              @Override
              public void onItemClick(View view, int position) {
                  switch(position)
                  {
                      case 0:
                        Intent i=new Intent(MainActivity.this,ScrollingActivity.class);
                        startActivity(i);
                        break;
                  }
              }

              @Override
              public void onLongItemClick(View view, int position) {
                    switch(position)
                    {
                        case 0:
                            Toast toast=Toast.makeText(MainActivity.this,"ButterNun",Toast.LENGTH_SHORT);
                            toast.show();
                            break;
                    }
              }
          }));
    }
}