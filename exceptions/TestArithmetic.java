package in.co.exceptions;

public class TestArithmetic {

	public static void main(String[] args) {
		
		
		String name = null;
		try {
		System.out.println(name.charAt(10));
		}catch(NullPointerException e) {
			System.err.println("String Khali hai");
		}
	}

}