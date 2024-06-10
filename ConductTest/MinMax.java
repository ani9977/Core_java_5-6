package in.co.ConductTest;

public class MinMax {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int min, max;

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		System.out.println("min" + min);
		System.out.println("max" + max);
	}

}
