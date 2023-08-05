package com.in28minutes.exceptionhandling;
public class ExceptionHandlerRunner2 {

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
        try {            
//            String str = null;
//            str.length();
            int[] i = {1,2};
            int number = i[3];
            System.out.println("Method2 ended");
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("Matched NullPointerException");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Matched ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Matched Exception");
        e.printStackTrace();
    }
    }

}
