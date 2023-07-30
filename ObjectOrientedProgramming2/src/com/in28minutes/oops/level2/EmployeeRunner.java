package com.in28minutes.oops.level2;

public class EmployeeRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee employee = new Employee();
        employee.setName("Felipe");
        employee.setEmail("felipe@email.com");
        employee.setPhone("123-456-7890");
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer Analyst");
        
        System.out.println(employee);
        
    }

}
