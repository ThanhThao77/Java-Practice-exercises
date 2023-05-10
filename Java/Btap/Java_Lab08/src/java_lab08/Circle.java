package java_lab08;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double radius) {
		radius = radius;
		color = "red";
	}
	
	public double getRadius( ) {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle: radius=" + radius + " color=" + color;
	}
}
