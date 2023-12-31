package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
        // TODO Auto-generated constructor stub
        this.game = game;
    }

    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Running Game: " + String.valueOf(game.getClass()));
        game.up();
        game.down();
        game.right();
        game.left();

    }
}
