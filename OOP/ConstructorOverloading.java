package in.co.OOP;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("i am default constructor");
	}

	public ConstructorOverloading(int a) {
		this();
		System.out.println("i am parameterized Constructor");
	}

	public ConstructorOverloading(int a, int b) {
		this(a);
		System.out.println("i am two parameterized Constructor");
	}

	public ConstructorOverloading(int a, int b, int c) {
		this(a, b);
		System.out.println("i am three parameterized Constructor");

	}

	public ConstructorOverloading(int a, int b, int c, int x) {
		this(a, b, c);
		System.out.println("i am four parameterized Constructor ");
	}

	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading(10, 20, 30, 40);

	}
}
