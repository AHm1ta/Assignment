package com.example.assignmenttask.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.assignmenttask.R;

import static com.example.assignmenttask.R.color.black;
import static com.example.assignmenttask.R.color.white;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView left2;
    LinearLayout time1, time2, time3, time4;
    TextView text1, text2, text3, text4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        left2=findViewById(R.id.left2);
        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        time3 = findViewById(R.id.time3);
        time4 = findViewById(R.id.time4);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);

        time1.setOnClickListener(this);
        time2.setOnClickListener(this);
        time3.setOnClickListener(this);
        time4.setOnClickListener(this);

        left2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,MainActivity.class));
                finish();
            }
        });

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.time1:
                Time1();
                break;
            case R.id.time2:
                Time2();
                break;
            case R.id.time3:
                Time3();
                break;
            case R.id.time4:
                Time4();
                break;
        }
    }

    @SuppressLint("ResourceAsColor")
    private void Time1(){
        time1.setBackgroundResource(R.drawable.time_bg);
        time2.setBackgroundResource(R.drawable.time_bg2);
        time3.setBackgroundResource(R.drawable.time_bg2);
        time4.setBackgroundResource(R.drawable.time_bg2);
    }
    private void Time2(){
        time1.setBackgroundResource(R.drawable.time_bg2);
        time2.setBackgroundResource(R.drawable.time_bg);
        time3.setBackgroundResource(R.drawable.time_bg2);
        time4.setBackgroundResource(R.drawable.time_bg2);
    }
    private void Time3(){
        time1.setBackgroundResource(R.drawable.time_bg2);
        time2.setBackgroundResource(R.drawable.time_bg2);
        time3.setBackgroundResource(R.drawable.time_bg);
        time4.setBackgroundResource(R.drawable.time_bg2);
    }
    private void Time4(){
        time1.setBackgroundResource(R.drawable.time_bg2);
        time2.setBackgroundResource(R.drawable.time_bg2);
        time3.setBackgroundResource(R.drawable.time_bg2);
        time4.setBackgroundResource(R.drawable.time_bg);
    }
}