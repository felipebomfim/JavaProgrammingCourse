package com.in28minutes.exceptionhandling;

public class CheckedExceptionRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        try {
//            someOtherMethod();
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }
        someOtherMethod2();
    }

    private static void someOtherMethod() throws InterruptedException {
        // TODO Auto-generated method stub
        Thread.sleep(2000);
        
    }
    
    private static void someOtherMethod2() throws RuntimeException {
        // TODO Auto-generated method stub        
    }

}
