package in.co.Comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 10, 6, 1,100);

		if (numbers == null || numbers.size() < 2) {
			System.out.println("The list does not have enough elements.");
			return;
		}

		Collections.sort(numbers, Collections.reverseOrder());

		Integer secondLargest = numbers.get(1);

		System.out.println("The second largest number is: " + secondLargest);
	}
}
