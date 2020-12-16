package com.ete.fragefeuden;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String opponentName;
    private int playerScore;
    private int opponentScore;
    private List<Integer> usedQuestions = new ArrayList<>();

    public Game(String opponentName){
        this.opponentName = opponentName;
    }

    public void incrementPlayerScore(){
        this.playerScore++;
    }

    public void incrementOpponentScore(){
        this.opponentScore++;
    }

    public void useQuestion(int questionID){
        this.usedQuestions.add(questionID);
    }

}
