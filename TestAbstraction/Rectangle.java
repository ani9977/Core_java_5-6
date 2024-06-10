package in.co.TestAbstraction;

public class Rectangle extends Shape {

	private int Length;
	private int width;

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double area() {

		return Length * width;
	}

}
