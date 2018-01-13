package com.example.kapoo.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int currentA = 0, currentB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View v) {
        currentA += 3;
        displayForTeamA(currentA);
    }

    public void addTwoForTeamA(View v) {
        currentA += 2;
        displayForTeamA(currentA);
    }

    public void addOneForTeamA(View v) {
        currentA++;
        displayForTeamA(currentA);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View v) {
        currentB += 3;
        displayForTeamB(currentB);
    }

    public void addTwoForTeamB(View v) {
        currentB += 2;
        displayForTeamB(currentB);
    }

    public void addOneForTeamB(View v) {
        currentB++;
        displayForTeamB(currentB);
    }
public void resetScore(View v){
    currentA = 0;
    currentB = 0;
    displayForTeamA(currentA);
    displayForTeamB(currentB);
}

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);

        scoreView.setText(String.valueOf(score));
    }
}