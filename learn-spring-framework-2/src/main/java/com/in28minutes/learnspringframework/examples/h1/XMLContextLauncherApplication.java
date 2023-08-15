package com.in28minutes.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.*;


public class XMLContextLauncherApplication {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (var context = new ClassPathXmlApplicationContext("contextConfigurationFile.xml")){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            context.getBean(GameRunner.class).run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
