package com.in28minutes.oops.level2;

import java.math.BigDecimal;

public class Employee extends Person{
    private String title;
    private String employer;
    private char employeeGrade;
    private BigDecimal salary;

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getEmployer() {
        return employer;
    }



    public void setEmployer(String employer) {
        this.employer = employer;
    }



    public char getEmployeeGrade() {
        return employeeGrade;
    }



    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }



    public BigDecimal getSalary() {
        return salary;
    }



    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }



    
    
        
//    public Employee(String name, String phone, String email, String title, String employer, char employeeGrade, BigDecimal salary) {
//        super(name, phone, email);
//        this.title = title;
//        this.employer = employer;
//        this.employeeGrade = employeeGrade;
//        this.salary = salary;
//        // TODO Auto-generated constructor stub
//    }

    @Override
    public String toString() {
        return "Employee [name = "+ this.getName() + ", phone = "+ this.getPhone()+", email = "+ this.getEmail() +", title = " + title + ", employeeGrade = " + employeeGrade + "]";
    }
    

}
