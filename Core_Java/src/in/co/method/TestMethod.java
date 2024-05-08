package in.co.method;

public class TestMethod {

	public static void main(String[] args) {

		add(30, 50);
		div(10, 20);
		multi(20,40);

	}

	private static void multi(int a, int b) {
		double d = a*b;
		System.out.println(d);
		
	}

	private static void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void div(int a, int b) {
		double div = b / a;
		System.out.println(div);

	}

}
