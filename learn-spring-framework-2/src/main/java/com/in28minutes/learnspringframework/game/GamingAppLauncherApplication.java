package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.*;


@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
            context.getBean(GameRunner.class).run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
