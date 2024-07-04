package in.co.Basics;

public class Test {

	public static void SaySomething() {
		System.out.println("hello world");
	}

	public static void add() {
		int a = 10;
		int b = 30;
		System.out.println("Add:" + (a + b));
	}

	public static int Multiply(int a, int b) {

		return a * b;

	}

	public static void main(String[] args) {

		Test t = new Test();
		t.add();
		t.SaySomething();
		System.out.println(t.Multiply(30, 40));

	}
}
