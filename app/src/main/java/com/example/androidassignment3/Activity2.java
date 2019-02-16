package com.example.androidassignment3;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button home = null;
    private Button activity_3 = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        
        this.home = (Button)findViewById(R.id.home);
        this.activity_3 = (Button)findViewById(R.id.activity3);

        this.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,
                        com.example.androidassignment3.MainActivity.class);
                startActivity(intent);
            }
        });
        this.activity_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,
                        com.example.androidassignment3.Activity3.class);
                startActivity(intent);
            }
        });
    }
}