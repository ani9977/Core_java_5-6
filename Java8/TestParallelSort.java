package in.co.Java8;

import java.util.Arrays;

public class TestParallelSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
		Arrays.parallelSort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
