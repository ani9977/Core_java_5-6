package in.co.method;

public class CheckMethod {

	public void sayhello() {
		System.out.println("hello students");
	}

	public static int add(int a, int b) {
		return a + b;

	}

	public static void multiply(int a, int b) {
		int mul = a * b;
		System.out.println("multiply=" + mul);
	}

	public static void main(String[] args) {
		CheckMethod c = new CheckMethod();
		c.sayhello();
		c.multiply(10, 20);
		System.out.println(c.add(10, 20));

	}

}
