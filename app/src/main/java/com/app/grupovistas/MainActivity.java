package com.app.grupovistas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnExercise1, btnExercise2, btnExercise3, btnExercise4, btnExercise5, btnExercise6, btnExercise7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnExercise1.setOnClickListener(click -> {
            openExercise(Exercise1.class);
        });
        btnExercise2.setOnClickListener(click -> {
            openExercise(Exercise2.class);
        });
        btnExercise3.setOnClickListener(click -> {
            openExercise(Exercise3.class);
        });
        btnExercise4.setOnClickListener(click -> {
            openExercise(Exercise4.class);
        });
        btnExercise5.setOnClickListener(click -> {
            openExercise(Exercise5.class);
        });
        btnExercise6.setOnClickListener(click -> {
            openExercise(Exercise6.class);
        });
        btnExercise7.setOnClickListener(click -> {
            openExercise(Exercise7.class);
        });
    }

    private void openExercise(Class name) {
        Intent openExercise = new Intent(this, name);
        startActivity(openExercise);
    }

    private void init() {
        btnExercise1 = findViewById(R.id.btnExercise1);
        btnExercise2 = findViewById(R.id.btnExercise2);
        btnExercise3 = findViewById(R.id.btnExercise3);
        btnExercise4 = findViewById(R.id.btnExercise4);
        btnExercise5 = findViewById(R.id.btnExercise5);
        btnExercise6 = findViewById(R.id.btnExercise6);
        btnExercise7 = findViewById(R.id.btnExercise7);
    }
}