package com.example.alimentos.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alimentos.viewholder.FoodViewHolder;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    //Gerenciar o conteudo da recyclerview
    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
