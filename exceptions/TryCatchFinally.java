package in.co.exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {

		String name = null ;
		try {
			       System.out.println(name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Choti hai");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("i'm always executed");
		}

	}

}
