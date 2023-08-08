package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {
    
    @Bean
    public GamingConsole game() {
        var game = new SuperContraGame();
        return game;
    }
    
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

// // TODO Auto-generated method stub
////  var marioGame = new MarioGame();
////  var superContraGame = new SuperContraGame();
//  var pacmanGame = new PacmanGame(); //1: Object Creation
//  var gameRunner = new GameRunner(pacmanGame); 
//      //2: Object Creation + Wiring of Dependencies
//      // Game is a dependency of GameRunner
//  
//  gameRunner.run();
}
