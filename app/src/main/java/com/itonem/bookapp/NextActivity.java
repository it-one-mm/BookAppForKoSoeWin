package com.itonem.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    boolean iszawgyi=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Button btn = findViewById(R.id.btn);
        final TextView text = findViewById(R.id.text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(!iszawgyi)
               {
                   text.setText(Rabbit.uni2zg(text.getText().toString()));
                   iszawgyi=true;
               }
               else
               {
                   text.setText(Rabbit.zg2uni(text.getText().toString()));
                   iszawgyi=false;
               }
            }
        });
    }
}
