package com.example.pointuppointdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Score;
    private Button AddPoint, ReducePoint;
    private int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        setID();
        AddPoint();
        ReducePoint();
    }
    private void setID(){
        Score = findViewById(R.id.Score);
        AddPoint = findViewById(R.id.AddPoint);
        ReducePoint = findViewById(R.id.ReducePoint);
    }
    private void AddPoint(){
        AddPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 5;
                Score.setText(getResources().getString(R.string.Score) + " " + score);
            }
        });
    }
    private void ReducePoint(){
        ReducePoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score -= 5;
                Score.setText(getResources().getString(R.string.Score) + " " + score);
            }
        });
    }
}