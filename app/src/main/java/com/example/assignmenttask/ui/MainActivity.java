package com.example.assignmenttask.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.assignmenttask.R;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb;
    ImageView left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb  = findViewById(R.id.pb);
        left=findViewById(R.id.left);

        pb.setProgress(60);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                finish();
            }
        });
    }
}