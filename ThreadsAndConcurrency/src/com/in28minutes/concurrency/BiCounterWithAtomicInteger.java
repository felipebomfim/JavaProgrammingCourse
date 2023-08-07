package com.in28minutes.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();
    
    
    void incrementI(String caller) {
        i.incrementAndGet();
    }
    
    void incrementJ(String caller) {
        j.incrementAndGet();
    }
    
    public int getI() {
        return i.get();
    }
    public int getJ() {
        return j.get();
    }

}
