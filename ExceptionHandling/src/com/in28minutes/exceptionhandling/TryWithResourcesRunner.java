package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        try (Scanner scanner = new Scanner(System.in))
         {
            
            int[] numbers = {12,3,4,5};
            
            int number = numbers[5];
            
        }
        
        System.out.println("Just before closing out main");
        

    }

}
