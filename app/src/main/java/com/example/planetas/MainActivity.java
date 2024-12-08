package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button mercurioBtn,venusBtn,tierraBtn,marteBtn,jupiterBtn,saturnoBtn,uranoBtn,neptunoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mercurioBtn = findViewById(R.id.btnMercurio);
        mercurioBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VideoActivityMercurio.class);
            startActivity(intent);
        });
        venusBtn = findViewById(R.id.btnVenus);
        venusBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VideoActivityVenus.class);
            startActivity(intent);
        });
        tierraBtn = findViewById(R.id.btnTierra);
        tierraBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VideoActivityTierra.class);
            startActivity(intent);
        });
        marteBtn = findViewById(R.id.btnMarte);
        marteBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VideoActivityMarte.class);
            startActivity(intent);
        });
        jupiterBtn = findViewById(R.id.btnJupiter);
        jupiterBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VideoActivityJupiter.class);
            startActivity(intent);
        });
        saturnoBtn = findViewById(R.id.btnSaturno);
        saturnoBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VideoActivitySaturno.class);
            startActivity(intent);
        });
        uranoBtn = findViewById(R.id.btnUrano);
        uranoBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VideoActivityUrano.class);
            startActivity(intent);
        });
        neptunoBtn = findViewById(R.id.btnNeptuno);
        neptunoBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VideoActivityNeptuno.class);
            startActivity(intent);
        });





    }
}