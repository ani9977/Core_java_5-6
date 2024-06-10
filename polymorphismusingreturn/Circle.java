package in.co.polymorphismusingreturn;

public class Circle extends Shape {
	private double radius;

	public Circle() {

	}

	public Circle(int radius) {

		this.radius = radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
