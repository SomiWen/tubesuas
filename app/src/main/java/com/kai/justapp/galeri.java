package com.kai.justapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class galeri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
    }

    public void MainActivity(View view) {
        Intent intent = new Intent(galeri.this, MainActivity.class);
        startActivity(intent);
    }
}
