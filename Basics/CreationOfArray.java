package in.co.Basics;

public class CreationOfArray {

	public static void main(String[] args) {
                //program for creating an array
		int marks[] = new int[50];
		int numbers[] = { 1, 2, 3, 4, };
		String fruits[] = { "apple", "mango", "bnana" };
		char[] copyfrom = { 'a', 'b', 'c', 'd','e','f','g','h','i','j','k' };
		char[] copyto = new char[7];
		System.arraycopy(copyfrom, 0, copyto, 0, 2);

		for (char c : copyto) {
			System.out.println(c);
		}
	}
}
