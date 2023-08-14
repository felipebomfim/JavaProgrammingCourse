package com.in28minutes.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.*;

@Component
class YourBusinessClass{
	
//	Constructor Dependency Injection -- PREFERRED
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		// TODO Auto-generated constructor stub
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}


//Field Injection
//	@Autowired
	private Dependency1 dependency1;
	
//	@Autowired
	private Dependency2 dependency2;
	
	
	

// Setter Dependency Injection
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("SetDependency1");
//		this.dependency1 = dependency1;
//	}
//	
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("SetDependency2");
//		this.dependency2 = dependency2;
//	}

	public Dependency1 getDependency1() {
		return dependency1;
	}

	
	public Dependency2 getDependency2() {
		return dependency2;
	}
	
	

	@Override
	public String toString() {
		return "YourBusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}
	
	
}

@Component
class Dependency1{}

@Component
class Dependency2{}


@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
