package in.co.Inheritance;

public class Circle extends Shape {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}