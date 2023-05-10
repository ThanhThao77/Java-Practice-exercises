/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;


public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius=1.0;
        this.color="red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    
    
    public double getArea(){
        return radius*radius*3.14;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    @Override
    public String toString() {
        return "Circle with radius="+radius+", and color="+color;
    }
    
    
}
