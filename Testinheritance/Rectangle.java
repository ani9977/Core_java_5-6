package in.co.Testinheritance;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(String color, int borderwidth, int length, int width) {
		super(color, borderwidth);
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {

		return length * width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

}
