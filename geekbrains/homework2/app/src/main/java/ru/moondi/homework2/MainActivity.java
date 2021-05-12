package ru.moondi.homework2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
// Для приложения будет использоваться ConstraintLayout как наиболее универсальный и гибкий.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}