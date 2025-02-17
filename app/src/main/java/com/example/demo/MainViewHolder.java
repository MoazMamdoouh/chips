package com.example.demo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder  {
    TextView name ;
    TextView des ;
    TextView letter ;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.row_tv_name);
        des = itemView.findViewById(R.id.row_tv_des);
        letter = itemView.findViewById(R.id.row_image) ;
    }
}
