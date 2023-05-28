package com.ander.recview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mainadapter extends RecyclerView.Adapter<mainadapter.holderview> {

    Context contxt;
    String[] title, details, details2;
    int[] image1, image2;

    public mainadapter(Context contxt, String[] title, String[] details, int[] image1, int[] image2, String[] details2) {
        this.contxt = contxt;
        this.title = title;
        this.details = details;
        this.details2 = details2;
        this.image1 = image1;
        this.image2 = image2;
    }

    @NonNull
    @Override
    public holderview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflate = LayoutInflater.from(contxt);
        View view1 = layoutInflate.inflate(R.layout.cdetails, parent, false);


        return new holderview(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull holderview holder, int position) {

        holder.imgv.setImageResource(image1[position]);
        holder.ttv1.setText(title[position]);
        holder.ttv2.setText(details[position]);

        holder.imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = String.valueOf(image2[position]);

                Intent intent1 = new Intent(contxt, MainActivity2.class);
                intent1.putExtra("photo",d);
                intent1.putExtra("countr",String.valueOf(title[position]));
                intent1.putExtra("details",String.valueOf(details2[position]));
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                contxt.startActivity(intent1);

            }
        });

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    class holderview extends RecyclerView.ViewHolder
    {
        ImageView imgv;
        TextView ttv1, ttv2;

        public holderview(@NonNull View itemView) {
            super(itemView);

            imgv = (ImageView) itemView.findViewById(R.id.c_img);
            ttv1 = (TextView) itemView.findViewById(R.id.c_title);
            ttv2 = (TextView) itemView.findViewById(R.id.c_details);


        }

    }


}
