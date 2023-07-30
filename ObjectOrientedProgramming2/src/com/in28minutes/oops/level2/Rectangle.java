package com.in28minutes.oops.level2;

public class Rectangle {

    private double length;
    private double width;
    private double area;
    private double perimeter;
    
    public Rectangle(double length, double width) {
        // TODO Auto-generated constructor stub
        this.length = length;
        this.width = width;
        this.setArea();
        this.setPerimeter();
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    private void setArea() {
        // TODO Auto-generated method stub
        this.area = width*length;
    }
    
    public double getArea() {
        return area;
    }
    
    private void setPerimeter() {
        this.perimeter = 2*(width+length); 
    }
    
    public double getPerimeter() {
        return perimeter;
    }

    public void turnIntoSquare(double side) {
        // TODO Auto-generated method stub
        this.width = side;
        this.length = side;
        setArea();
        setPerimeter();
    }
    
    public String toString() {
        return String.format("width: %.2f, length: %.2f, area: %.2f, perimeter: %.2f", width, length, area, perimeter);
    }

}
