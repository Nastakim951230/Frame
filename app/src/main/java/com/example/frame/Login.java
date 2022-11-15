package com.example.frame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Registratsia(View v) {
        Intent intent = new Intent( this, Registr.class);
        startActivity(intent);
    }
    public void Starting(View v) {
        Intent intent = new Intent( this, Start.class);
        startActivity(intent);
    }
}