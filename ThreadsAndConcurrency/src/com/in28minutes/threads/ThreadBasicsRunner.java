package com.in28minutes.threads;

class Task extends Thread {
    private int id;
    public Task(int id) {
        this.id = id;
    }
    public void run() {
        System.out.print("\n Task "+id+" Started\n");
        for (int i=id*100+1; i<=id*100+99; i++)
            System.out.print(i+" ");
        
        Thread.yield();
        
        System.out.print("\n Task "+id+" Done\n");
        
    }
}

class Task2 implements Runnable {
    public void run() {
        for (int i=201; i<=299; i++)
            System.out.print(i+" ");
        System.out.print("\n Task2 Done\n");
    }
}

public class ThreadBasicsRunner {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        //Task 1
        Task task1 = new Task(1);
        
        task1.setPriority(10);
        task1.start();
        

        //Task2
        Task2 task2 = new Task2();
        Thread threadTask2 = new Thread(task2);
        threadTask2.setPriority(1);
        threadTask2.start();
        
        task1.join();
        
      //Task3
        for (int i=301; i<=399; i++)
            System.out.print(i+" ");
        System.out.print("\n Task3 Done\n");
        
        
        
        System.out.print("\n Main Done\n");

    }

}
