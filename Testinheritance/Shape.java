package in.co.Testinheritance;

public class Shape {

	private String color;
	private int borderwidth;

	public Shape(String color, int borderwidth) {
		this.borderwidth = borderwidth;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public double area() {
		return 0;
	}

}
