package in.co.Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
        
		TreeSet s = new TreeSet();

		s.add(25);
		s.add(100);
		s.add(40);
		s.add(21);

		System.out.println(s);

		Iterator it = s.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
