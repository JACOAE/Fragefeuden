package com.ete.fragefeuden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        final int TALTAK = 9999;
        int int_random = rand.nextInt(TALTAK);

        Game newGame = new Game(int_random);

        int numOfGames = player.getGameList().size();

        //Byt denna när man ska ha mer spel
        if(numOfGames < 4){
            player.getGameList().add(newGame);

            Button spelKnapp = null;

            switch(numOfGames){
                case 0:
                    spelKnapp = (Button) findViewById(R.id.spel0);
                    break;
                case 1:
                    spelKnapp = (Button) findViewById(R.id.spel1);
                    break;
                case 2:
                    spelKnapp = (Button) findViewById(R.id.spel2);
                    break;
                case 3:
                    spelKnapp = (Button) findViewById(R.id.spel3);
                    break;
            }

            spelKnapp.setText(String.valueOf(int_random));
            spelKnapp.setVisibility(View.VISIBLE);
        }
    }

    //Denna kallas när man fortsätter ett spel som redan är igång
    public void continueGame(View view){

    }

    public void joinGame(View view){

        EditText joinGameNumber = (EditText) findViewById(R.id.joinGameNumber);
        int gameNumber = Integer.parseInt(joinGameNumber.getText().toString());


    }



}