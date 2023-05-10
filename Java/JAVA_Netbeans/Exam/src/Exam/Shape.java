/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exam;

/**
 *
 * @author Thanh Thảo
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    private String color = "red";
    private boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        
    }
 
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    
   

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (isFilled()? "filled" : "notfilled");
    }
    
    
}
