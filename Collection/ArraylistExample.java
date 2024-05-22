package in.co.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {

		ArrayList l1 = new ArrayList();

		l1.add(10);
		l1.add(20);
		System.out.println(l1);

		ArrayList l2 = new ArrayList();

		l2.add(30);
		l2.add(40);
		l2.addAll(l1);
		System.out.println(l2);
		System.out.println(l1.size() + " " + l2.size());
		// l2.clear();

		Iterator it = l2.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}