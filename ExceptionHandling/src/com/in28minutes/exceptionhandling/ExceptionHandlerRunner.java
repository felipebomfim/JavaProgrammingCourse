package com.in28minutes.exceptionhandling;
public class ExceptionHandlerRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        method1();
        System.out.println("Maind ended");


    }

    private static void method1() {
        method2();
        System.out.println("Method1 ended");

    }

    private static void method2() {
        String str = null;
        str.length();
        System.out.println("Method2 ended");
    }

}
