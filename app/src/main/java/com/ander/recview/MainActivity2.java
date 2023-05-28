package com.ander.recview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imv;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bndl = getIntent().getExtras();


        int img = Integer.parseInt(bndl.getString("photo"));
        String textV1 = bndl.getString("countr");
        String textV2 = bndl.getString("details");

        imv = findViewById(R.id.pho);
        tv1 = findViewById(R.id.text1);
        tv2 = findViewById(R.id.text2);

        imv.setImageResource(img);
        tv1.setText(textV1);
        tv2.setText(textV2);


    }
}