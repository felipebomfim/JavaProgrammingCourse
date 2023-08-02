package com.in28minutes.oops.level2;

public class AnimalsRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animal[] animals = {new Cat(), new Dog()};
        
        for (Animal animal: animals)
            animal.bark();
    }

}
