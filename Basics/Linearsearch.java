package in.co.Basics;

public class Linearsearch {

	public static int search(char[] letters, int key) {

		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == key) {
				return i;
			}

		}
		return -1;

	}

	public static void main(String[] args) {

//		int []numbers = { 2, 4, 6, 8, 10, 12, 13, 14, 15, 100 };
//		int key = 100;
		char[] letters = { 'a', 'b', 'c', 'd' };
		char key = 'a';
		int index = search(letters, key);
		if (index == -1) {
			System.out.println("key not found=" + key);
		} else {
			System.out.println("key is at index=" + key);
		}
	}
}
