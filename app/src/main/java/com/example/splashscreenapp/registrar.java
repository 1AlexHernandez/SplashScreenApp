package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
    }

    public void inicia (View view) {
        Intent intent = new Intent(registrar. this, login.class);
        startActivity(intent);
    }

    public void perfil3(View view) {
        Intent intent = new Intent(registrar. this, MainActivity.class);
        startActivity(intent);
    }
}