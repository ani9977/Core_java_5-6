package in.co.method;

public class TestMethod {

	public static void sub(int i, int j) {
		int sub = i - j;
		System.out.println("subtraction" + sub);

	}

	public static void multi(int a, int b) {
		double d = a * b;
		System.out.println(d);

	}

	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void div(int a, int b) {
		double div = b / a;
		System.out.println(div);

	}

	public static void main(String[] args) {

		sub(70, 80);
		add(30, 50);
		div(10, 20);
		multi(20, 40);

	}

}
