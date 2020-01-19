package com.example.stayfittracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tutorials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
    }

    public void deadliftClick(View view) {
        Intent intent = new Intent(this, DeadliftTutorial.class);
        startActivity(intent);
    }
}
