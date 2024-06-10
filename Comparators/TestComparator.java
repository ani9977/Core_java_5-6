package in.co.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(5, "chetan", 1000));
		list.add(new Employee(2, "shruti", 3000));
		list.add(new Employee(1, "vishal", 2500));
		list.add(new Employee(4, "rachit", 1200));
		list.add(new Employee(3, "rajendra", 5000));
		list.add(new Employee(6, "yogesh", 5000));

//		 Collections.sort(list);

//		 Collections.sort(list, new OrderByIdAsc());

		Collections.sort(list, new OrderByIdDesc());

		for (Object object : list) {
			System.out.println(object);
		}

	}

}