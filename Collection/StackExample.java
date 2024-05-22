package in.co.Collection;

import java.util.Iterator;
import java.util.Stack;

// stack is last in first out first in last out
public class StackExample {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push("Ram");
		s.push("Shyam");
		s.push(100);
		s.push(null);

		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.push("Raman"));
		System.out.println(s);
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);  
		}

	}

}
