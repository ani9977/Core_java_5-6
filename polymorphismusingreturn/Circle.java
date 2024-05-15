package in.co.polymorphismusingreturn;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {

		this.radius = radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
