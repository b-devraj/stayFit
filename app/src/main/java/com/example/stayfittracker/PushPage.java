package com.example.stayfittracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PushPage extends AppCompatActivity {

    public int pushCounter = 0;
    public int tricepCounter = 0;
    public int shoulderCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_page);
    }

    //______________________________________________________________________________________________

    //Push ups counter
    public void pushUpCounter(View view) {

        pushCounter++;

        if (pushCounter < 4) {
            ((TextView) findViewById(R.id.pushUpText3)).setText(String.valueOf(pushCounter));
        }

        else {
            ((TextView) findViewById(R.id.pushUpText3)).setText(String.valueOf(pushCounter));
            ((TextView) findViewById(R.id.pullUpText2)).setText("sets, next exercise!");

            ((Button) findViewById(R.id.pullTrackButton)).setEnabled(false);
            ((Button) findViewById(R.id.deadTrackerButton)).setEnabled(true);
        }

    }

    //______________________________________________________________________________________________

    //Tricep Dips counter

    public void tricepCounter(View view) {

        tricepCounter++;

        if (tricepCounter < 4) {
            ((TextView) findViewById(R.id.deadText3)).setText(String.valueOf(tricepCounter));
        }

        else {
            ((TextView) findViewById(R.id.deadText3)).setText(String.valueOf(tricepCounter));
            ((TextView) findViewById(R.id.deadText2)).setText("sets, next exercise!");

            ((Button) findViewById(R.id.deadTrackerButton)).setEnabled(false);
            ((Button) findViewById(R.id.latTracker)).setEnabled(true);
        }
    }

    //______________________________________________________________________________________________

    //Shoulder press counter
    public void shoulderCounter(View view) {
        shoulderCounter++;

        if (shoulderCounter < 4) {
            ((TextView) findViewById(R.id.latText3)).setText(String.valueOf(shoulderCounter));
        }

        else {
            ((TextView) findViewById(R.id.latText3)).setText(String.valueOf(shoulderCounter));
            ((TextView) findViewById(R.id.latText2)).setText(String.valueOf("sets, you're done!"));

            ((Button) findViewById(R.id.latTracker)).setEnabled(false);
        }

    }
}
