package in.co.Basics;

public class TestArray {

	public static void main(String[] args) {

		char ch[] = { 'a', 'b', 'c', 'f', 'g', 'u', 'z' };
		char key = 'x';
		int index = Search(ch, key);
		if (index == -1) {
			System.out.println("Key not found index:" + index);
		} else {
			System.out.println(("Key is at index:" + index));
		}

	}

	public static int Search(char ch[], char key) {

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == key) {
				return i;
			}

		}

		return -1;

	}

}
