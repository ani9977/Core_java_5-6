package in.co.Collection;

import java.util.ArrayList;
import java.util.List;

// List Can Be Null
// List Can Be Duplicate
// List in Always Natural Order
// List Supported Multiple Data Type
public class ListInterfaceMethods {

	public static void main(String[] args) {

		List l1 = new ArrayList();

		l1.add(10);
		l1.add(5.1);
		l1.add("A");
		l1.add("Salar");

		System.out.println("All Element Of List " + l1);

		System.out.println("Index Of Salar is " + l1.indexOf("Salar")); // indexOf Search from start
		System.out.println(l1.lastIndexOf("A")); // lastIndexOf Search from last

		System.out.println("l1 from 0 ind to 3 ind " + l1.subList(0, 3));

		System.out.println("--------------------------");

		l1.add(2, 78); // add(0, 0) add element at given index
		System.out.println("add 78 at ind 2 " + l1);

		System.out.println("--------------------------");

		l1.set(1, 10.1); // set() set element at given index remove previous element at same index
		System.out.println("Set 10.1 at index 1 " + l1);

		System.out.println("--------------------------");

		System.out.println(l1.isEmpty());

		System.out.println("--------------------------");

		System.out.println(l1.contains(10));

		System.out.println("--------------------------");

	}
}
