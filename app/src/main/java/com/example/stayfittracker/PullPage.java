package com.example.stayfittracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PullPage extends AppCompatActivity {

    public int pull_ups = 0;
    public int deadlifts = 0;
    public int lat_pulls = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_page);
    }

    //______________________________________________________________________________________________

    //Pull ups counter
    public void pullUpCounter(View view) {

        pull_ups++;

        if (pull_ups < 4) {
            ((TextView) findViewById(R.id.pullUpText3)).setText(String.valueOf(pull_ups));
        }

        else {
            ((TextView) findViewById(R.id.pullUpText3)).setText(String.valueOf(pull_ups));
            ((TextView) findViewById(R.id.pullUpText2)).setText("sets, next exercise!");

            ((Button) findViewById(R.id.pullTrackButton)).setEnabled(false);
            ((Button) findViewById(R.id.deadTrackerButton)).setEnabled(true);
        }

    }

    //______________________________________________________________________________________________

    //Deadlifts counter

    public void deadliftCounter (View view) {

        deadlifts++;

        if (deadlifts < 4) {
            ((TextView) findViewById(R.id.deadText3)).setText(String.valueOf(deadlifts));
        }

        else {
            ((TextView) findViewById(R.id.deadText3)).setText(String.valueOf(deadlifts));
            ((TextView) findViewById(R.id.deadText2)).setText("sets, next exercise!");

            ((Button) findViewById(R.id.deadTrackerButton)).setEnabled(false);
            ((Button) findViewById(R.id.latTracker)).setEnabled(true);
        }
    }

    //______________________________________________________________________________________________

    //Shoulder press counter
    public void latCounter (View view) {
        lat_pulls++;

        if (lat_pulls < 4) {
            ((TextView) findViewById(R.id.latText3)).setText(String.valueOf(lat_pulls));
        }

        else {
            ((TextView) findViewById(R.id.latText3)).setText(String.valueOf(lat_pulls));
            ((TextView) findViewById(R.id.latText2)).setText(String.valueOf("sets, you're done!"));

            ((Button) findViewById(R.id.latTracker)).setEnabled(false);
        }

    }
}
