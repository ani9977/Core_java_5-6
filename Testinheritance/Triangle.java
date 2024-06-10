package in.co.Testinheritance;

public class Triangle extends Shape {

	private int base;
	private int height;

	public Triangle(String color, int borderwidth, int base, int height) {
		super(color, borderwidth);
		this.base = base;
		this.height = height;

	}

	public int getBase() {
		return base;
	}

//	public void setBase(int base) {
//		this.base = base;
//	}

	public int getHeight() {
		return height;
	}

//	public void setHeight(int height) {
//		this.height = height;
//	}

	@Override
	public double area() {

		return base * height;
	}

}
