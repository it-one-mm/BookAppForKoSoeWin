package com.itonem.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView list,featurelist,popularlist;
    static RelativeLayout home;
    public static FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        home = findViewById(R.id.home);
        ArrayList<CategoryModel> categoryModels  = new ArrayList<>();
        categoryModels.add(new CategoryModel("Horror"));
        categoryModels.add(new CategoryModel("Mystery"));
        categoryModels.add(new CategoryModel("Fancy"));
        list = findViewById(R.id.categorylist);
        CategoryAdapter adapter = new CategoryAdapter(categoryModels);
        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,false));


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

        BookAdapter adapter1 = new BookAdapter(bookModels,getApplicationContext());
        featurelist = findViewById(R.id.featurelist);
        featurelist.setAdapter(adapter1);
        featurelist.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,false));


        popularlist = findViewById(R.id.popularlist);
        popularlist.setAdapter(adapter1);
        popularlist.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,false));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }

    public static void  setFragment(Fragment f)
    {
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container,f);
        ft.commit();
        home.setVisibility(View.GONE);
    }

}
