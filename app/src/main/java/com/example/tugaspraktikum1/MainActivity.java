package com.example.tugaspraktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button next, bt0, bt1, satu, nol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.btNext);
        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        satu = findViewById(R.id.btSatu);
        nol = findViewById(R.id.btNol);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNext = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intentNext);
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent0 = new Intent(MainActivity.this, Angka0.class);
                startActivity(intent0);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Angka1.class);
                startActivity(intent1);
            }
        });

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNol = new Intent(MainActivity.this, Angka0.class);
                startActivity(intentNol);
            }
        });

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSatu = new Intent(MainActivity.this, Angka1.class);
                startActivity(intentSatu);
            }
        });
    }
}
