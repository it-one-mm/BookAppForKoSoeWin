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

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookHolder> {

    ArrayList<BookModel> bookModels = new ArrayList<>();

    Context context;
    public BookListAdapter(ArrayList<BookModel> bookModels, Context context) {
        this.bookModels = bookModels;
        this.context = context;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.bookliststyle,parent,false);
        return new BookHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull BookHolder holder, int position) {

        holder.author.setText(bookModels.get(position).bookAuthor);
        holder.category.setText(bookModels.get(position).bookCategory);

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
        TextView title,author,category;
        public BookHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            author=itemView.findViewById(R.id.author);
            category=itemView.findViewById(R.id.category);
        }
    }
}
