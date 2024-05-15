package in.co.Inheritance;

public class Shape {
	private String color;
	private int borderwidth;

	public Shape(String color) {
		this.color = color;

	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public String getColor() {
		return color;
	}
	public double area() {
		return 0;
		
	}
}