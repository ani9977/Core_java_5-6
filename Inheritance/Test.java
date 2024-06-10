package in.co.Inheritance;

public class Test {

	public static void main(String[] args) {
		
		

		Circle circle = new Circle();
		Triangle triangle = new Triangle("blue", 4, 3);
		Rectangle r = new Rectangle("blue", 10, 20);
		System.out.println("Circle color: " + circle.getColor());
		System.out.println("Circle area: " + circle.area());

		System.out.println("Triangle color: " + triangle.getColor());
		System.out.println("Triangle area: " + triangle.area());
         
		System.out.println("Rectangle color: "+r.getColor());
		System.out.println("Rectangle area: "+r.area());
	}

}
