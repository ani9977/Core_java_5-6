package in.co.method;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("i'm Default Constructor");
	}

	public ConstructorOverloading(int a) {

		System.out.println("i'm parameterized Constructor");
	}

	public ConstructorOverloading(int a, int b) {

		System.out.println("i'm two parameterized Constructor");
	}

	public ConstructorOverloading(int a, int b, int c) {

		System.out.println("i'm three parameterized Constructor");
	}

	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading(10,20,20);

	}

}
