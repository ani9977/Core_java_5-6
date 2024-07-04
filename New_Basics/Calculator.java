package in.co.Basics;

public class Calculator {

	public int addition(int a, int b) {
		return a + b;
	}

	public  double Multi(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		System.out.println(c.addition(30, 50));
		System.out.println(c.Multi(20.5, 78.9));

	}

}
