package com.ete.fragefeuden;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String playerName;
    private List<Game> gameList = new ArrayList<>();


    public Player (String playerName){
        this.playerName = playerName;
    }


    public List<Game> getGameList() {
        return gameList;
    }
}
