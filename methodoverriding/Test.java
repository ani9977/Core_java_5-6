package in.co.methodoverriding;

public class Test {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.setRadius(20);
		Rectangle r = new Rectangle();
		r.setLength(20);
		r.setWidth(30);
		//Triangle t = new Triangle();
		t.setBase(30);
		t.setHeight(40);
		System.out.println("Area of Circle:"  c.area());
		System.out.println("Area of Triangle:" + t.area());
		System.out.println("Area of Rectangle:" + r.area());

	}

}
