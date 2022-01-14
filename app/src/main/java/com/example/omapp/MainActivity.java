package com.example.omapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;


    public void clickFunction(View view){

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this,WebActivity.class);
        startActivity(intent);


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}