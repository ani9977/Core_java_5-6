package in.co.Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {

		LinkedHashSet s = new LinkedHashSet();

		s.add("Welcome");
		s.add("To");
		s.add("Geeks");
		s.add("4");
		s.add("Geeks");

		System.out.println(s);

		Iterator it = s.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		// System.out.println(set);

	}

}