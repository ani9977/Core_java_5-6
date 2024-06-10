package in.co.exceptions;

public class TestArithmetic {

	public static void main(String[] args) {

		String s[] = { "Raman" };
		try {
          System.out.println(s.length);
          System.out.println(s[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("String ki length choti hai");
			System.out.println();
		}
	}

}