package com.in28minutes.oops.level2;


public class CustomerRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        Address johnAdress = new Address("1111", "New York", "Line 1");
        Customer customer = new Customer("John Doe", johnAdress );
        
        System.out.println(customer);
        
        Address newAddress = new Address("2222", "Tokyo", "Line 2");
        
        customer.setWorkAddress(newAddress);
        
        System.out.println(customer);
    }

}
