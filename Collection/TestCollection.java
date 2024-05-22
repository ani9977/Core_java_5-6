package in.co.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add("Bura mt Dekho");
		c.add("Bura mt Suno");
		c.add("Bura mt Bolo");
		c.add(10);
		c.add(10.20);
		c.add(true);
		c.add('a');
		Collection c1 = new ArrayList();
		c1.add(10);
		c1.add(2);

		System.out.println(c);
		System.out.println("Size:" + c.size());
		System.out.println("AddCollection:" + c.addAll(c1));
		System.out.println("After Add:" + c);
//		System.out.println("Membership:" + c.contains(0));
//		System.out.println("Iterator:" + c.iterator());
//		System.out.println("Retain:" + c.retainAll(c1));
//		System.out.println("Retain now:" + c);
//		System.out.println("Remove:" + c.removeAll(c1));
//		System.out.println("After Remove" + c);
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Object A = it.next();
			System.out.println(A);
		}

	}
}
