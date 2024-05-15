package in.co.polymorphism;

public class Rectangle extends Shape {

	double length;
	double Width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.Width = width;
	}

	public double area() {

		return length * Width;
	}

}
