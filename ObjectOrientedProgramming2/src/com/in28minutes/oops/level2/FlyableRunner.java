package com.in28minutes.oops.level2;

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable [] flyables = {new Bird(), new Aeroplane()};
        
        for (Flyable flyable: flyables)
            flyable.fly();
    }   
}
