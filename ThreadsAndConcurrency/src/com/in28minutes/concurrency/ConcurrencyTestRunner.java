package com.in28minutes.concurrency;

import java.util.Iterator;

class ParallelTask extends Thread
{
    private CounterTest counter;
    public ParallelTask (CounterTest counter) {
        this.counter = counter;
    }
    
    public void run() {
        while(counter.getI()<=100) {
            counter.incrementAndPrint("Parallel");
        }
    }
}

public class ConcurrencyTestRunner {
    public static void main(String[] args) {
        CounterTest mainCounter = new CounterTest();
        
        ParallelTask parallelCounter = new ParallelTask(mainCounter);
        parallelCounter.setPriority(10);
        parallelCounter.start();
        
        while(mainCounter.getI()<=100) {
            mainCounter.incrementAndPrint("Main");
        }
        
    }
}
