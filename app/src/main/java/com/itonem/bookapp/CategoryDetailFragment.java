package com.itonem.bookapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryDetailFragment extends Fragment {

    public CategoryDetailFragment() {
        // Required empty public constructor
    }

RecyclerView list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View myView = inflater.inflate(R.layout.fragment_category_detail, container, false);


       list=myView.findViewById(R.id.list);
        ArrayList<BookModel> bookModels = new ArrayList<>();
        BookModel model1= new BookModel();
        model1.bookTitle="Alice Wonder Land";
        model1.bookImage="https://images-na.ssl-images-amazon.com/images/I/713mugMLIOL._AC_UL160_.jpg";

        BookModel model2=new BookModel();
        model2.bookTitle="Romeo and Juliet";
        model2.bookImage="https://images-na.ssl-images-amazon.com/images/I/51a19gVGt-L._AC_.jpg";

        BookModel model3=new BookModel();
        model3.bookTitle="Sherlock Homes";
        model3.bookImage="https://images.fineartamerica.com/images-medium-large-5/sherlock-holmes-book-cover-poster-art-1-nishanth-gopinathan.jpg";


        bookModels.add(model1);
        bookModels.add(model2);
        bookModels.add(model3);

        BookListAdapter bookListAdapter =new BookListAdapter(bookModels,getContext());
        list.setAdapter(bookListAdapter);
        list.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        return myView;

    }
}
