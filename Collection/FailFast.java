package in.co.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("hey");
		l.add(3);
		l.add(4);
		l.add(null);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.err.println(o);
		}

	}

}
