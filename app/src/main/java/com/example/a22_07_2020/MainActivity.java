package com.example.a22_07_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int value=tinhtong(5,20);
        Log.d("BBB",String.valueOf(value));


    }
    private int tinhtong(int a, int b)
    {
        int ketqua=a+b;
        return ketqua;
    }
}