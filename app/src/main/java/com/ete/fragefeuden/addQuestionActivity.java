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
//cool

public class addQuestionActivity extends AppCompatActivity implements Runnable{

    DatabaseReference myRef;
    FirebaseDatabase root;
    String questionString, correctString, wrong1String, wrong2String, wrong3String;
    EditText question, correct, wrong1, wrong2, wrong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);
        Toast.makeText(addQuestionActivity.this, "Connected", Toast.LENGTH_LONG).show();

        question = findViewById(R.id.editTextQuestion);
        correct = findViewById(R.id.editTextCorrect);
        wrong1 = findViewById(R.id.editTextWrong1);
        wrong2 = findViewById(R.id.editTextWrong2);
        wrong3 = findViewById(R.id.editTextWrong3);
    }

    public void onSendQuestion(View view) {

        root = FirebaseDatabase.getInstance();
        myRef = root.getReference("questions");


        questionString = question.getText().toString();
        correctString = correct.getText().toString();
        wrong1String = wrong1.getText().toString();
        wrong2String = wrong2.getText().toString();
        wrong3String = wrong3.getText().toString();
        //databaseAddQuestion addQuestionClass = new databaseAddQuestion(questionString, correctString, wrong1String, wrong2String, wrong3String);
        //myRef.child(questionString).setValue(addQuestionClass);
        Thread t1  = new Thread(new addQuestionActivity());
        t1.start();

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

    public boolean noEmptyValues() {
        if (question.getText().toString().equals("") || correct.getText().toString().equals("") || wrong1.getText().toString().equals("") || wrong2.getText().toString().equals("") || wrong3.getText().toString().equals("")) {
            return false;
        } else return true;
    }
    @Override
    public void run() {
        try {
            databaseAddQuestion addQuestionClass = new databaseAddQuestion(questionString, correctString, wrong1String, wrong2String, wrong3String);
            myRef.child(questionString).setValue(addQuestionClass);
        }catch (Exception e) {}
    }

}