package com.itonem.bookapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookHolder> {

    ArrayList<BookModel> bookModels = new ArrayList<>();

    Context context;
    public BookAdapter(ArrayList<BookModel> bookModels, Context context) {
        this.bookModels = bookModels;
        this.context = context;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.bookitem,parent,false);
        return new BookHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull BookHolder holder, int position) {

        Glide.with(context)
                .load(bookModels.get(position).bookImage)
                .into(holder.image);
        holder.title.setText(bookModels.get(position).bookTitle);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,NextActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
            return bookModels.size();
    }

    public class BookHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;
        public BookHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
        }
    }
}
