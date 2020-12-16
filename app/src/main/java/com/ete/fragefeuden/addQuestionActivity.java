package com.ete.fragefeuden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class addQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);
    }

    public void onSendQuestion(View view) {
        EditText question = (EditText) findViewById(R.id.editTextQuestion);
        EditText correct = (EditText) findViewById(R.id.editTextCorrect);
        EditText wrong1 = (EditText) findViewById(R.id.editTextWrong1);
        EditText wrong2 = (EditText) findViewById(R.id.editTextWrong2);
        EditText wrong3 = (EditText) findViewById(R.id.editTextWrong3);

        String questionString = question.getText().toString();
        String correctString = correct.getText().toString();
        String wrong1String = wrong1.getText().toString();
        String wrong2String = wrong2.getText().toString();
        String wrong3String = wrong3.getText().toString();

        //TODO skicka värden till databas

        question.setText("");
        correct.setText("");
        wrong1.setText("");
        wrong2.setText("");
        wrong3.setText("");

        Context context = getApplicationContext();
        CharSequence text = "Skickad!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}