package in.co.Comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(2, "A", 1000));

		list.add(new Employee(4, "C", 3000));

		list.add(new Employee(3, "B", 2000));

		list.add(new Employee(1, "E", 4000));

		list.add(new Employee(5, "D", 5000));

		list.add(new Employee(6, "F", 6000));

		Collections.sort(list);

		for (Object object : list) {
			System.out.println(object);
		}

	}

}
