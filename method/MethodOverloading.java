package in.co.method;

public class MethodOverloading {

	public void MyMethod() {
		System.out.println("hello World");
	}

	public void MyMethod(int a, int b) {
		int c = a + b;
		System.out.println("Sum of two integer:" + c);

	}

	public void MyMethod(int a, int b, int c) {
		System.out.println("sum:" + a + b + c);
	}

}
