package in.co.exceptions;

public class TypeOfException {

	public static void main(String[] args) {

		// Test NumberFormateException
//		String a = "anik9et";
//
//		try {
//
//			int i = Integer.parseInt(a);
//			System.out.println(i);
//
//		} catch (NumberFormatException e) {
//			System.out.println("NumberFormateException........");
//		}

//		System.out.println("_________________");
//
//		// Test ArithMeticException
//		int i = 10;
//
//		try {
//			i = i / 0;
//			System.out.println(i);
//		}
//
//		catch (ArithmeticException e) {
//			System.out.println(e.getMessage() + " ArithmeticException......");
//		}
//
//		System.out.println("_________________");
//
//		// Test StringIndexOutOfBondException
//		String str = "Java";
//
//		try {
//
//			System.out.println(str.charAt(7));
//
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//
//		System.out.println("_________________");
//
//		// Test NullPointerException
//		String str1 = null;
//
//		try {
//
//			System.out.println(str1.length());
//
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerException");
//		}
//
//		System.out.println("_________________");
//
		// Test ArrayIndexOutOfBondException
		String[] str2 = { "a", "b", "c" };

		try {

			System.out.println(str2[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}