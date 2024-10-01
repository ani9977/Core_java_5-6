package in.co.Abstraction;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {

	}

	public Rectangle(int length, int width) {

		this.length = length;
		this.width = width;
		System.out.println("this.width");
	}

	@Override
	public double area() {

		return length * width;
	}

}
