package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button red = (Button) findViewById(R.id.red);
        Button yellow = (Button) findViewById(R.id.yellow);
        Button green = (Button) findViewById(R.id.green);
        final LinearLayout layout = (LinearLayout) findViewById(R.id.LinearLayout);

        red.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.RED);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.YELLOW);
            }
        });

        green.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.GREEN);
            }
        });
    }
}