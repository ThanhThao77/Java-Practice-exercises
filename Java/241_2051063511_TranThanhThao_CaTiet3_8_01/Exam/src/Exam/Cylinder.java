/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import java.awt.geom.Area;

/**
 *
 * @author Thanh Thảo
 */
public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius = " + radius + "which is a subclass of " + super.toString();
    }
    
    
}
