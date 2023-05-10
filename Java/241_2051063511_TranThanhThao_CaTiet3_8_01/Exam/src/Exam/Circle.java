/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exam;

/**
 *
 * @author Thanh Thảo
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    double radius = 1.0;
    private String color= "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
    public double getArea(){
        return Math.PI * radius*2;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius + " , and color = " + color;
    }
    
    
    
}
