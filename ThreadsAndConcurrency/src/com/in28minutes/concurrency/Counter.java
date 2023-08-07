package com.in28minutes.concurrency;

public class Counter {
    private int i=0;
    
    
    synchronized void increment(String caller) {
        i++;
    }
    
    public int getI() {
        return i;
    }

}
