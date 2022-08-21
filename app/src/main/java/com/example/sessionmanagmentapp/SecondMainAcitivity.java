package com.example.sessionmanagmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondMainAcitivity extends AppCompatActivity {
    Button bu=null;
    Button bu2=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main_acitivity);

        bu=(Button)findViewById(R.id.button2);
        bu2=(Button)findViewById(R.id.button3);
    }

    public  void logout(View view){
        SharedPreferences sharedpreferences = getSharedPreferences(MainActivity.MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.clear();
        editor.commit();
    }

    public void close(View view){
        finish();
    }
}