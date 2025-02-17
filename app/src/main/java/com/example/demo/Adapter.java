package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<MainViewHolder> {
    private Context context ;
    private List<Pojo> pojos ;

    public Adapter(Context context, List<Pojo> pojos) {
        this.context = context;
        this.pojos = pojos;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context) ;
        View view = layoutInflater.inflate(R.layout.row_list , parent , false) ;
        MainViewHolder mainViewHolder = new MainViewHolder(view) ;
        return mainViewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.name.setText(pojos.get(position).getName());
        holder.des.setText(pojos.get(position).getDescription());
        holder.letter.setText(pojos.get(position).getLitter());
    }

    @Override
    public int getItemCount() {
        return pojos.size();
    }
}
