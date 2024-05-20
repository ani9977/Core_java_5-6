package in.co.exceptions;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[5]); // This will cause an ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds.");
		} catch (Exception e) {
			System.out.println("Exception: An unexpected error occurred.");
		}
	}
}
