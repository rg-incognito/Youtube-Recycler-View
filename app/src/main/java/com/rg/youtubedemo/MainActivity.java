package com.rg.youtubedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] linkdata,titledata;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            RecyclerView recyclerView = findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);

            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(mLayoutManager);

            String[] videoIds = {"dAFZS3gNY-A", "8ZvFXrJSX6o", "5pCHQLEJsz4", "5pCHQLEJsz4", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY"};
            String[] title = {"Waalian - Harnoor ", "Kun Faya Kun - A.R. Rahman", "Raanjhanaa - A.R. Rahman", "BROWN MUNDE - AP DHILLON | GURINDER GILL | SHINDA KAHLON | GMINXR\n", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY"};

            RecyclerView.Adapter recyclerViewAdapter = new RecyclerViewAdapter(videoIds, this.getLifecycle(),title);
            recyclerView.setAdapter(recyclerViewAdapter);
        }

    }
