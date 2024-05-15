package in.co.Inheritance;

public class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle(String color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public double area() {
		return 0.5 * base * height;
	}
}