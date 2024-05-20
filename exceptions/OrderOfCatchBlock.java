package in.co.exceptions;

public class OrderOfCatchBlock {
	public static void main(String[] args) {

		String name = "vijay";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("string choti hai");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
