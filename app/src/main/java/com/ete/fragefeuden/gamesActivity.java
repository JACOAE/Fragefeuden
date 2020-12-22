package com.ete.fragefeuden;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class gamesActivity extends AppCompatActivity {

    private List<Game> gameList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
    }


    //Denna kallas när man startar nytt game
    protected void createNewGame(){

    }

    //Denna kallas när man fortsätter ett spel som redan är igång
    protected void continueGame(){

    }
}