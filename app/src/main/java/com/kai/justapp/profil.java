package com.kai.justapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void MainActivity(View view) {
        Intent intent = new Intent(profil.this, MainActivity.class);
        startActivity(intent);
    }
}
