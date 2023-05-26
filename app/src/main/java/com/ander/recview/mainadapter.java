package com.ander.recview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mainadapter extends RecyclerView.Adapter<mainadapter.holderview> {

    Context contxt;
    String[] title, details;
    int[] image1;

    public mainadapter(Context contxt, String[] title, String[] details, int[] image1) {
        this.contxt = contxt;
        this.title = title;
        this.details = details;
        this.image1 = image1;
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
