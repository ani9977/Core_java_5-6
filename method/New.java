package in.co.method;

public class New {

	public static void SaySomething() {

		System.out.println("hello students");

	}

	public static void main(String[] args) {

		New.SaySomething();
		System.out.println();
		New n = new New();
		System.out.println(n.add(10, 20));
		Say();

	}

	private int add(int i, int j) {
		return i + j;

	}

	private static void Say() {
		System.out.println("hello guys");

	}

}
