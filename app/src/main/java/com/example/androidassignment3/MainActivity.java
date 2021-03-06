/*
 * CSE41246 - Android Java Fundamentals
 * Winter 2019
 * Assignment #3
 * Hoong, Jasper
 */
package com.example.androidassignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button activity_2 = null;
    private Button activity_3 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.activity_2 = (Button)findViewById(R.id.activity2);
        this.activity_3 = (Button)findViewById(R.id.activity3);

        this.activity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        com.example.androidassignment3.Activity2.class);
                startActivity(intent);
            }
        });
        this.activity_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        com.example.androidassignment3.Activity3.class);
                startActivity(intent);
            }
        });
    }
}
