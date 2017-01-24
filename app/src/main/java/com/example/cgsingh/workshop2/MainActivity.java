package com.example.cgsingh.workshop2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a2button = (Button) findViewById(R.id.a2_button);
        a2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a2intent = new Intent("com.seneca.lab2b.christopher");
                startActivityForResult(a2intent, 1);
            }
        });

        Button a3button = (Button) findViewById(R.id.a3_button);
        a3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}