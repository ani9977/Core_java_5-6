package in.co.polymorphismusingreturn;

public class Test {
	public static void main(String[] args) {

		Shape s1 = Shape.getShape(1);
		Shape s2 = Shape.getShape(2);
		Shape s3 = Shape.getShape(3);
        
		System.out.println("area of Rectangle="+s1.area());
		System.out.println("area of Circle="+s2.area());
		System.out.println("area of Triangle="+s3.area());
	}
}
