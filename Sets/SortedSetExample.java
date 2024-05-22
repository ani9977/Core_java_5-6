package in.co.Sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {

		// SortedSet output by default ASC order
		SortedSet s = new TreeSet();

		s.add(9);
		s.add(20);
		s.add(4);

		System.out.println("Last:" + s.last());
		System.out.println("First:" + s.first());

		System.out.println(s);

		for (Object ele : s) {

			System.out.println(ele);

		}

	}

}
