package com.itonem.bookapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryHolder> {


    ArrayList<CategoryModel>categoryModels = new ArrayList<>();

    public CategoryAdapter(ArrayList<CategoryModel> categoryModels) {
        this.categoryModels = categoryModels;
    }

    @NonNull
    @Override
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.categoryitem,parent,false);
        CategoryHolder holder = new CategoryHolder(myView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryHolder holder, int position) {

        holder.categoryName.setText(categoryModels.get(position).categoryName);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.setFragment(new CategoryDetailFragment());
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryModels.size();
    }

    public class CategoryHolder extends RecyclerView.ViewHolder{
        TextView categoryName;
        public CategoryHolder(@NonNull View itemView) {

            super(itemView);
            categoryName = itemView.findViewById(R.id.categoryName);
        }
    }
}
