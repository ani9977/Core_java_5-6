package in.co.polymorphism;

public class Triangle extends Shape {

	private int base;
	private int hieght;

	public Triangle(int base, int hieght) {

		this.base = base;
		this.hieght = hieght;
	}

	public double area() {
		return base * hieght;
	}

}
