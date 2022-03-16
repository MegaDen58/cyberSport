package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity {

    int naviCounter = 0;
    int g2Counter = 0;

    Button plusPointToNavi;
    Button plusPointToG2;
    TextView naviScore;
    TextView g2Score;
    Button reset;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plusPointToNavi = (Button) findViewById(R.id.plusPointToNavi);
        naviScore = (TextView) findViewById(R.id.naviScore);
        plusPointToG2 = (Button) findViewById(R.id.plusPointToG2);
        g2Score = (TextView) findViewById(R.id.g2Score);
        reset = (Button) findViewById(R.id.reset);
        plusPointNavi();
        plusPointG2();
        Reset();
        if (savedInstanceState != null && savedInstanceState.containsKey("naviCounter"))
        {
            naviCounter = savedInstanceState.getInt("naviCounter");
        }
        if (savedInstanceState != null && savedInstanceState.containsKey("g2Counter"))
        {
            g2Counter = savedInstanceState.getInt("g2Counter");
        }
        naviScore.setText(naviCounter + "");
        g2Score.setText(g2Counter + "");

    }


    void plusPointNavi() {
        plusPointToNavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naviCounter++;
                naviScore.setText(naviCounter + "");
            }
        });
    }
    void plusPointG2() {
        plusPointToG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g2Counter++;
                g2Score.setText(g2Counter + "");
            }
        });
    }
    void Reset(){
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                naviScore.setText("0");
                g2Score.setText("0");
                naviCounter = 0;
                g2Counter = 0;
            }
        });
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("naviCounter", naviCounter);
        savedInstanceState.putInt("g2Counter", g2Counter);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("naviCounter")) {
            naviCounter = savedInstanceState.getInt("naviCounter");
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("g2Counter")) {
            naviCounter = savedInstanceState.getInt("g2Counter");
        }
    }
}
