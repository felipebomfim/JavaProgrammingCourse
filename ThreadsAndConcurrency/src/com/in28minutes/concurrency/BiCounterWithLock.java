package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    private int i=0;
    private int j=0;
    
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();
    
    private String caller;
    
    
    void incrementI(String caller) {
        lockForI.lock();
        i++;
        lockForI.unlock();
    }
    
    void incrementJ(String caller) {
        lockForJ.lock();
        j++;
        lockForJ.unlock();
    }
    
    public int getI() {
        return i;
    }
    public int getJ() {
        return j;
    }

}
