package com.in28minutes.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class FunctionalProgrammingMagic {

    /**
     * This method filters out the odd numbers from a given list of integers.
     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
     * @return List<Integer> This returns a list of odd integers.
     */
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        
        // Write your code here
        return numbers.stream()
                    .filter(n -> Math.abs(n%2)==1)
                    .collect(Collectors.toList());
    }
    
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        // Write your code here
        if (n==0)
            return new ArrayList <Integer>();
        return IntStream.range(1, n+1)
                .map(num -> Integer.valueOf(num*num*num))
                .boxed()
                .collect(Collectors.toList());
    }
    
    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        // TODO: Write code
        if (courses == null)
            return new ArrayList <Integer>();
        return courses.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());
        
    }
    
    public static long sumOfSquares(List<Integer> numbers) {
        
        // Check if the list is null. If so, return 0.
        if (numbers == null)
            return 0;    

        // Stream over the list of numbers, find squares and sum them up
        return numbers.stream().reduce(0,(n1,n2)->n1+n2*n2);
        
    }
    
    public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here
        if (numbers == null)
            return 0;
            
        return numbers.stream()
                .filter(n->n%2==0)
                .max(Integer::compare)
                .orElse(0);
    }
}