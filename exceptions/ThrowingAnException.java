package in.co.exceptions;

public class ThrowingAnException {

	public static void main(String[] args) {
		try {
			checkAge(10); // This will throw an exception
		} catch (IllegalArgumentException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public static void checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Age must be 18 or above to vote.");
		} else {
			System.out.println("You are eligible to vote.");
		}
	}

}
