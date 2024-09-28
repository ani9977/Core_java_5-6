package in.co.Basics;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {

//		for (int i = 0; i <=3; i++) {
//			if(i==3) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("i'm out from the loop");

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("welcome to breakstatement");
			System.out.println("enter your number :");

			int n = sc.nextInt();
			if (n % 10 == 0) {
				break;
			}
			System.out.println(n);
		} while (true);

	}

}
