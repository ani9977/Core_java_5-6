package in.co.polymorphism;

public class Test {

	public static void main(String[] args) {

		Circle s = new Circle(20);
		Shape s1 = new Rectangle(10, 20);
		Shape s2 = new Triangle(20, 30);
		System.out.println("Circle area=" + s.area());
		System.out.println("Rectangle area=" + s1.area());
		System.out.println("triangle=" + s2.area());
	
		
	

	}
}
