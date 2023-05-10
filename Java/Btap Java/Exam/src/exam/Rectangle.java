/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

/**
 *
 * @author thang
 */
public class Rectangle extends Shape{
    private double widlth=1.0;
    private double length =1.0;

    public Rectangle() {
    }
     public Rectangle(double widlth, double length) {
      this.length=length;
      this.widlth=widlth;
    }
    public Rectangle(double widlth, double length,String color, boolean filled) {
        super(color, filled);
        setLength(length);
        setWidlth(widlth);
        
    }

    public double getWidlth() {
        return widlth;
    }

    public void setWidlth(double widlth) {
        this.widlth = widlth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+widlth+" and length = "+length+", which is subclass of "+super.toString();
    }
    public double getArea(){
        return widlth*length;
    }
    
    public double getPerimeter(){
        return (widlth*length)*2;
    }
//    public static void main(String[] args) {
//        Rectangle s = new Rectangle(3.0,3.0,"blue",false);
//        System.err.println(s.toString());
//    }
}
