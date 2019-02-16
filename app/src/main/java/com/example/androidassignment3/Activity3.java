package com.example.androidassignment3;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button home = null;
    private Button activity_2 = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        this.home = (Button)findViewById(R.id.home);
        this.activity_2 = (Button)findViewById(R.id.activity2);

        this.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this,
                        com.example.androidassignment3.MainActivity.class);
                startActivity(intent);
            }
        });
        this.activity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this,
                        com.example.androidassignment3.Activity2.class);
                startActivity(intent);
            }
        });
    }
}