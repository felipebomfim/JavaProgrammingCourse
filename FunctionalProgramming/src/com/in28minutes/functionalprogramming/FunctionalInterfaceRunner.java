package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class OddNumberPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer t) {
        // TODO Auto-generated method stub
        return t%2 == 1;
    }
    
}

class ForEachConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer t) {
        // TODO Auto-generated method stub
        System.out.println(t);
        
    }
    
}

public class FunctionalInterfaceRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        List.of(23,43,34,45,36,48).stream().filter(num -> num%2 == 1).forEach(System.out::println);
//        List.of(23,43,34,45,36,48).stream().filter(new OddNumberPredicate()).forEach(System.out::println);
        List.of(23,43,34,45,36,48).stream().filter(new OddNumberPredicate()).forEach(new ForEachConsumer());

    }

}
