package com.example.a22_07_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int value=tinhtong(5,210);
        Log.d("BBB",String.valueOf(value));
        inthongbao("ThongBao");

    }
    private int tinhtong(int a, int b)
    {
        int ketqua=a+b;
        return ketqua;
    }
    // Annotation dinh nghia chuc nang, cach su ly,...
    private void inthongbao(String mes)
    {
        Toast.makeText(MainActivity.this,mes,Toast.LENGTH_LONG).show();
    }
}