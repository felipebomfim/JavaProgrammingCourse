package com.in28minutes.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class  CallableTask implements Callable<String>{
    
    private String name;

    public CallableTask(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public String call() throws Exception {
        // TODO Auto-generated method stub
        Thread.sleep(1000);
        return  ("Hello "+ name);
    }
    
}

public class CallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // TODO Auto-generated method stub
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        
        String name = "Felipe";
        Future<String> welcomeFuture = executorService.submit(new CallableTask(name));
        
        System.out.println("\nNew CallableTask(\""+name+"\") executed.\n");
        
        String welcomeMessage = welcomeFuture.get();
        
        System.out.println(welcomeMessage);
        
        executorService.shutdown();
    }

}
