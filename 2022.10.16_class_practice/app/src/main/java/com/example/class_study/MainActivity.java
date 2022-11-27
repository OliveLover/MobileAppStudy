package com.example.class_study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Random rd = new Random();                             //랜덤
    int a = rd.nextInt(6);

    public void home(View view){                         //home 으로 이동
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void open1(View view) {

        ImageView m = findViewById(R.id.monsterball1);  //몬스터볼 객체 선언
        ImageView p = findViewById(R.id.pikachu1);      //피카츄 객체 선언
        ImageView mi = findViewById(R.id.mimikyu1);     //따라큐 객체 선언

        m.setVisibility(View.INVISIBLE);               //몬스터볼 사라짐

        if (a == 0) {
            p.setVisibility(View.VISIBLE);
        }
        else
            mi.setVisibility(View.VISIBLE);
    }

    public void open2(View view) {

        ImageView m = findViewById(R.id.monsterball2);
        ImageView p = findViewById(R.id.pikachu2);
        ImageView mi = findViewById(R.id.mimikyu2);

        m.setVisibility(View.INVISIBLE);

        if (a == 1) {
            p.setVisibility(View.VISIBLE);
        }else
            mi.setVisibility(View.VISIBLE);

    }

    public void open3(View view) {

        ImageView m = findViewById(R.id.monsterball3);
        ImageView p = findViewById(R.id.pikachu3);
        ImageView mi = findViewById(R.id.mimikyu3);

        m.setVisibility(View.INVISIBLE);

        if (a == 2) {
            p.setVisibility(View.VISIBLE);
        }else
            mi.setVisibility(View.VISIBLE);
    }

    public void open4(View view) {

        ImageView m = findViewById(R.id.monsterball4);
        ImageView p = findViewById(R.id.pikachu4);
        ImageView mi = findViewById(R.id.mimikyu4);

        m.setVisibility(View.INVISIBLE);

        if (a == 3) {
            p.setVisibility(View.VISIBLE);

        }else
            mi.setVisibility(View.VISIBLE);
    }

    public void open5(View view) {

        ImageView m = findViewById(R.id.monsterball5);
        ImageView p = findViewById(R.id.pikachu5);
        ImageView mi = findViewById(R.id.mimikyu5);

        m.setVisibility(View.INVISIBLE);

        if (a == 4) {
            p.setVisibility(View.VISIBLE);
        }else
            mi.setVisibility(View.VISIBLE);
    }

    public void open6(View view) {

        ImageView m = findViewById(R.id.monsterball6);
        ImageView p = findViewById(R.id.pikachu6);
        ImageView mi = findViewById(R.id.mimikyu6);

        m.setVisibility(View.INVISIBLE);

        if (a == 5) {
            p.setVisibility(View.VISIBLE);
        }
        else
            mi.setVisibility(View.VISIBLE);
    }
    public void exit(View view){                           //종료
        finishAffinity();
        System.runFinalization();
        System.exit(0);
    }
}
