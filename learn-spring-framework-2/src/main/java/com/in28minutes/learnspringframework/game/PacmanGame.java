package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

    @Override
    public void up() {
        // TODO Auto-generated method stub
        System.out.println("up");
    }

    @Override
    public void down() {
        // TODO Auto-generated method stub
        System.out.println("down");
    }

    @Override
    public void right() {
        // TODO Auto-generated method stub
        System.out.println("right");
    }

    @Override
    public void left() {
        // TODO Auto-generated method stub
        System.out.println("left");
    }

}
