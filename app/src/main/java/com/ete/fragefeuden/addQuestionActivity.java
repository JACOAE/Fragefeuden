package com.ete.fragefeuden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addQuestionActivity extends AppCompatActivity {

    DatabaseReference myRef;
    EditText question, correct, wrong1, wrong2, wrong3;
    databaseAddQuestion databaseAddQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);
        question = findViewById(R.id.editTextQuestion);
        correct = findViewById(R.id.editTextCorrect);
        wrong1 = findViewById(R.id.editTextWrong1);
        wrong2 = findViewById(R.id.editTextWrong2);
        wrong3 = findViewById(R.id.editTextWrong3);
        databaseAddQuestion = new databaseAddQuestion();
        myRef = FirebaseDatabase.getInstance().getReference().child("dataBaseAddActivity");
    }

    public void onSendQuestion(View view) {

        databaseAddQuestion.setCorrectString(question.getText().toString());
        databaseAddQuestion.setCorrectString(correct.getText().toString());
        databaseAddQuestion.setWrong1String(wrong1.getText().toString());
        databaseAddQuestion.setWrong2String(wrong2.getText().toString());
        databaseAddQuestion.setWrong3String(wrong3.getText().toString());

        myRef.push().setValue(databaseAddQuestion);
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