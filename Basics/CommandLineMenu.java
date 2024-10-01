package in.co.Basics;

import java.io.IOException;

import in.co.method.TestMethod;

public class CommandLineMenu {

	// public static void main(String[] args) throws IOException {

		sint ch = System.in.read();
		System.out.println("Selected char ASCII Code" + ch);
		if (ch == 'A' || ch == 'a') {
			DefineMethod.main(args);
		} else if (ch == 'D' || ch == 'd') {
			TestMethod.main(args);
		} else {
			System.out.println("incorrect choice");
		}

	}

}
