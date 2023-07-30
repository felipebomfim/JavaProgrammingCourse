package com.in28minutes.oops.level2;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;
    
    public Customer(String name, Address homeAddress) {
        super();
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHomeAdress() {
        return homeAddress;
    }

    public void setHomeAdress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
    }
    
}
