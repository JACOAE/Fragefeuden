package com.ete.fragefeuden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class gamesActivity extends AppCompatActivity {


    private List<Game> gameList = new ArrayList<>();
    Player player;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        Intent intent = getIntent();

        String playerName = intent.getStringExtra(Intent.EXTRA_TEXT);

        //Här ska det kollas med databasen om det finns en spelare med det namnet

        player = new Player(playerName);

        gameList = player.getGameList();
    }


    //Denna kallas när man startar nytt game
    public void createNewGame(View view){
        Random rand = new Random();
        int talTak = 9999;
        int int_random = rand.nextInt(talTak);

        Game newGame = new Game(int_random);

        int numOfGames = player.getGameList().size();

        player.getGameList().add(newGame);



    }

    //Denna kallas när man fortsätter ett spel som redan är igång
    protected void continueGame(){

    }
}