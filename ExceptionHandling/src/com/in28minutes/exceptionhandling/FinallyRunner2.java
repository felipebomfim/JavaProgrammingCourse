package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner scanner = new Scanner(System.in);
        try {
            
            int[] numbers = {12,3,4,5};
            
            int number = numbers[2];
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            System.out.println("Before Scanner close");
            if (scanner!=null) {
                
                scanner.close();
            }

        }
        
        System.out.println("Just before closing out main");
        

    }

}
