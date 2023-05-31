package com.ander.recview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;

import java.util.ArrayList;

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
    mainadapter2 madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reccview = (RecyclerView) findViewById(R.id.recview);
        countr_name = getResources().getStringArray(R.array.count_name);
        countr_details = getResources().getStringArray(R.array.count_details);
        countr_details2 = getResources().getStringArray(R.array.count_details2);

        madapter = new mainadapter2(MainActivity.this, dataque());

        reccview.setAdapter(madapter);
        //reccview.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        reccview.setLayoutManager(llm);
    }

    public ArrayList<Model> dataque()
    {
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setCountr_name("India");
        obj1.setCountr_details("India is a beautiful nation ");
        obj1.setImage(R.drawable.flag_c);
        holder.add(obj1);

        Model obj2 = new Model();
        obj2.setCountr_name("Israel");
        obj2.setCountr_details("Israel is a beautiful nation ");
        obj2.setImage(R.drawable.israel_c);
        holder.add(obj2);

        Model obj3 = new Model();
        obj3.setCountr_name("Ital");
        obj3.setCountr_details("Ital is a beautiful nation ");
        obj3.setImage(R.drawable.italy_c);
        holder.add(obj3);

        Model obj4 = new Model();
        obj4.setCountr_name("Jamaica");
        obj4.setCountr_details("Jamaica is a beautiful nation ");
        obj4.setImage(R.drawable.jamaica_c);
        holder.add(obj4);

        Model obj5 = new Model();
        obj5.setCountr_name("Japan");
        obj5.setCountr_details("Japan is a beautiful nation ");
        obj5.setImage(R.drawable.japan_c);
        holder.add(obj5);

        Model obj6 = new Model();
        obj6.setCountr_name("Morocco");
        obj6.setCountr_details("Morocco is a beautiful nation ");
        obj6.setImage(R.drawable.morocco_c);
        holder.add(obj6);

        Model obj7 = new Model();
        obj7.setCountr_name("South Korea");
        obj7.setCountr_details("South Korea is a beautiful nation ");
        obj7.setImage(R.drawable.sk_c);
        holder.add(obj7);

        Model obj8 = new Model();
        obj8.setCountr_name("United Kingdom");
        obj8.setCountr_details("United Kingdom is a beautiful nation ");
        obj8.setImage(R.drawable.uk_c);
        holder.add(obj8);

        Model obj9 = new Model();
        obj9.setCountr_name("USA");
        obj9.setCountr_details("USA is a beautiful nation ");
        obj9.setImage(R.drawable.us_c);
        holder.add(obj9);

        return holder;

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertD = new AlertDialog.Builder(MainActivity.this);

        alertD.setTitle("Alert");
        alertD.setMessage("Are u sure?");
        alertD.setIcon(R.drawable.baseline_notifications_24);
        alertD.setCancelable(false);

        alertD.setNeutralButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertD.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alert = alertD.create();
        alert.show();



    }
}