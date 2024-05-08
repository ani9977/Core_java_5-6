package in.co.Basics;

import java.util.Scanner;

public class PrintNumberOneToN {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int range=sc.nextInt();
		int counter = 1;
		while(counter <=range) {
			System.out.print(counter+" ");
			counter ++;
		}
		
		
		
		
	}

}
