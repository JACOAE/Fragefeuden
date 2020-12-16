package com.ete.fragefeuden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClickPlay(View view) {
        Intent onClickIntent = new Intent(HomeActivity.this, gamesActivity.class);
        startActivity(onClickIntent);
    }

    public void onClickAddQuestion(View view) {
        Intent addQuestionIntent = new Intent(HomeActivity.this, addQuestionActivity.class);
        startActivity(addQuestionIntent);
    }
}