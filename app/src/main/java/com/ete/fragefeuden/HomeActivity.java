package com.ete.fragefeuden;
//B)
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Alla älskar hundar
    }

    public void onClickPlay(View view) {

        EditText playerView = (EditText) findViewById(R.id.playerNameText);
        String playerName = playerView.getText().toString();

        Intent onClickIntent = new Intent(HomeActivity.this, gamesActivity.class);
        onClickIntent.putExtra(Intent.EXTRA_TEXT, playerName);

        startActivity(onClickIntent);
    }

    public void onClickAddQuestion(View view) {
        Intent addQuestionIntent = new Intent(HomeActivity.this, addQuestionActivity.class);
        startActivity(addQuestionIntent);
    }
}