package com.in28minutes.concurrency;

public class CounterTest {
    private int i=0;
    private String caller;
    
    
    synchronized void incrementAndPrint(String caller) {
        i++;
        System.out.println(caller+": i = "+i);
    }
    
    public int getI() {
        return i;
    }

}
