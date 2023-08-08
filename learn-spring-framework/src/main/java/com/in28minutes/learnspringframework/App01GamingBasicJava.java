package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        var marioGame = new MarioGame();
//        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame(); //1: Object Creation
        var gameRunner = new GameRunner(pacmanGame); 
            //2: Object Creation + Wiring of Dependencies
            // Game is a dependency of GameRunner
        
        gameRunner.run();
    }

}
