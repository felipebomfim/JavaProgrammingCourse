package com.in28minutes.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableAnyRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // TODO Auto-generated method stub
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        List <CallableTask> tasks = List.of(new CallableTask("John"), new CallableTask("Mary"), new CallableTask("Peter"));
        
        String task = executorService.invokeAny(tasks);
        
        System.out.println("Completed first: "+task);
        
        
        
        
        executorService.shutdown();
    }

}
