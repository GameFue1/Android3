package com.example.myapplication;



import static com.example.myapplication.R.id.but1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeLayout(View v){
        int id = v.getId();

        if(id== R.id.but1) setContentView(R.layout.w1);
        else if (id==R.id.but2){
            setContentView(R.layout.w2);
        }
        else if (id==R.id.but3){
            setContentView(R.layout.w3);
        }
        else if (id==R.id.but4){
            setContentView(R.layout.result);
            TextView textView = findViewById(R.id.tv1);
            textView.setText(String.valueOf(score));
            TextView textView1 = findViewById(R.id.tv2);
            textView1.setText(String.valueOf(untiscore));
        } else if (id==R.id.but5) { setContentView(R.layout.activity_main);
            score=0;
            untiscore=0;
        }

    }
    int score=0;
    int untiscore=0;
    public void yes(View view){
        score+=1;
    }

}