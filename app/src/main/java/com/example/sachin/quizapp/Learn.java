package com.example.sachin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Learn extends AppCompatActivity {


    Button learn,president,state,river;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        getSupportActionBar().hide();
        learn = (Button) findViewById(R.id.learn1);
        president=(Button) findViewById(R.id.learn2);
        state=(Button)findViewById(R.id.learn3);
        river=(Button)findViewById(R.id.learn4);


        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PrimeAdapter.class);
                startActivity(i);
                finish();
            }
        });

        president.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),PrimeAdapter.class);
                startActivity(i);
                finish();
            }
        });
        state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),StateAdapter.class);
                startActivity(i);
                finish();
            }
        });
        river.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainRiverAdapter.class);
                startActivity(i);
                finish();
            }
        });
    }
}
