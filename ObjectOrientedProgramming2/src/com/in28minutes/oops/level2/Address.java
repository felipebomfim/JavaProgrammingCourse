package com.in28minutes.oops.level2;

public class Address {
    private String zip;
    private String city;
    private String line1;
    
    public Address(String zip, String city, String line1) {
        super();
        this.zip = zip;
        this.city = city;
        this.line1 = line1;
    }

    @Override
    public String toString() {
        return "Address [zip=" + zip + ", city=" + city + ", line1=" + line1 + "]";
    }
    
    
}
