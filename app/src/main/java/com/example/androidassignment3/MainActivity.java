/*
 * CSE41246 - Android Java Fundamentals
 * Winter 2019
 * Assignment #3
 * Hoong, Jasper
 */
package com.example.androidassignment3;

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

        this.activity_2 = (Button)findViewById(activity2);
        this.activity_3 = (Button)findViewById(activity3);

        this.activity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,
                        com.example.androidassignment3.MainActivity.class);
                startActivity(intent1);
            }
        this.activity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,
                        com.example.androidassignment3.MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}
