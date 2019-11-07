package com.winlwinoo.libtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.winlwinoo.simplecalculator.SimpleCalculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a= SimpleCalculator.addNumber(5,3);
        System.out.println(a);
    }
}
