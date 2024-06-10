package in.co.Testinheritance;

public class Test {

	public static void main(String[] args) {

		Rectangle r = new Rectangle("Red", 10, 100, 200);
        Triangle t = new Triangle("Blue", 10, 20, 20);
        System.out.println(t.area());
		System.out.println(r.area());
	}

}
