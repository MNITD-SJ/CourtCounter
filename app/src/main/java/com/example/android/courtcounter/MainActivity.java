package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
    /**
     * Increases the score by one for Team A.
     */
    public void addOneForTeamA(View view){
        scoreTeamA++;
        displayForTeamA();
    }
    /**
     * Increases the score by two for Team A.
     */
    public void addTwoForTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA();
    }
    /**
     * Increases the score by three for Team A.
     */
    public void addThreeForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA();
    }
    /**
     * Increases the score by one for Team B.
     */
    public void addOneForTeamB(View view){
        scoreTeamB++;
        displayForTeamB();
    }
    /**
     * Increases the score by two for Team B.
     */
    public void addTwoForTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB();
    }
    /**
     * Increases the score by three for Team B.
     */
    public void addThreeForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB();
    }
    /**
     * Reset the score for Team A and Team B to zero.
     */
    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
