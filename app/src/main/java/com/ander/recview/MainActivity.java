package com.ander.recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView reccview;

    int [] image = {
            R.drawable.flag_c, R.drawable.israel_c, R.drawable.italy_c, R.drawable.jamaica_c,
            R.drawable.japan_c, R.drawable.morocco_c,
            R.drawable.sk_c, R.drawable.uk_c, R.drawable.us_c
    };
    int [] image2 = {
            R.drawable.india_r, R.drawable.israel_r, R.drawable.italy_r, R.drawable.jamaica_r,
            R.drawable.japan_r, R.drawable.morocco_r,
            R.drawable.sk_r, R.drawable.uk_r, R.drawable.us_r
    };

    String[] countr_name, countr_details, countr_details2;
    mainadapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reccview = (RecyclerView) findViewById(R.id.recview);
        countr_name = getResources().getStringArray(R.array.count_name);
        countr_details = getResources().getStringArray(R.array.count_details);
        countr_details2 = getResources().getStringArray(R.array.count_details2);

        madapter = new mainadapter(MainActivity.this, countr_name, countr_details, image, image2, countr_details2);

        reccview.setAdapter(madapter);
        reccview.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }
}