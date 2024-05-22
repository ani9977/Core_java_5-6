package in.co.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet s = new HashSet();

		s.add("Zero");
		s.add("One");
		s.add("Two");
		s.add("Three");

		System.out.println(s);
		System.out.println("----------");

		Iterator it = s.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());

		}

		HashSet s2 = new HashSet();

		s2.add(1);
		s2.add(5);
		s2.add(0);
		s2.add(3);
		s2.add(2);
		System.out.println("----------");
		System.out.println(s2);

//		System.out.println(s.contains(4));
		s2.remove(1);
//
//		System.out.println(s.size());

		Iterator itr = s2.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

			// s.add("a");
//		}

		}
	}
}