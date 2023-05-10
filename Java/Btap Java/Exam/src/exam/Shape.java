/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

/**
 *
 * @author thang
 */
public class Shape {
 
    String color ="red";
    boolean filled = true;

    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color=color;
        this.filled=filled;
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
        String s;
        if (filled) {
             s="filled";
        }
        else s = "not filled";
        return "A Shape with color of "+color+" and "+s;
    }
    
}
