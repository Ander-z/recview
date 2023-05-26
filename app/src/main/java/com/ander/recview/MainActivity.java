package com.ander.recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView reccview;

    int [] image = {
            R.drawable.india, R.drawable.israel, R.drawable.italy, R.drawable.jamaica,
            R.drawable.japan, R.drawable.morocco,
            R.drawable.sk, R.drawable.uk, R.drawable.us
    };

    String[] countr_name, countr_details;
    mainadapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reccview = (RecyclerView) findViewById(R.id.recview);
        countr_name = getResources().getStringArray(R.array.count_name);
        countr_details = getResources().getStringArray(R.array.count_details);

        madapter = new mainadapter(MainActivity.this, countr_name, countr_details, image);

        reccview.setAdapter(madapter);
        reccview.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }
}