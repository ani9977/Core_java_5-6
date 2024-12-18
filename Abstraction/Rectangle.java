package in.co.Abstraction;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {

	}

	public Rectangle(int length, int width) {
       
		System.out.println("this.length");
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {

		return length * width;
	}

}
