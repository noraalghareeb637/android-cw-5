package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button (View v){
         Intent intent = new Intent (MainActivity.this,MainActivity2.class);
         startActivity(intent);
    }
}