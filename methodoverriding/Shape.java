package in.co.methodoverriding;

public class Shape {
	private String color;
	private int borderwidth;

	public Shape(String color) {
		this.color = color;

	}

	public String getColor() {
		return color;
	}
	public double area() {
		return 0;
		
	}
}