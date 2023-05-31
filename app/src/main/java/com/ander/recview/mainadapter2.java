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

import java.util.ArrayList;

public class mainadapter2 extends RecyclerView.Adapter<mainadapter2.holderview> {

    Context contxt;
   ArrayList<Model> data;


    public mainadapter2(Context contxt, ArrayList<Model> data) {
        this.contxt = contxt;
        this.data = data;
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

        holder.imgv.setImageResource(data.get(position).getImage());
        holder.ttv1.setText(data.get(position).getCountr_name());
        holder.ttv2.setText(data.get(position).getCountr_details());

        holder.imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = String.valueOf(data.get(position).getImage());

                Intent intent1 = new Intent(contxt, MainActivity2.class);
                intent1.putExtra("photo",d);
                intent1.putExtra("countr",String.valueOf(data.get(position).getCountr_name()));
                intent1.putExtra("details",String.valueOf(data.get(position).getCountr_details()));
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                contxt.startActivity(intent1);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
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
