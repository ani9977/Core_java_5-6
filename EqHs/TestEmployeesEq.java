package in.co.EqHs;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeesEq {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "aniket", 20000);

		List l = new ArrayList();
		l.add(e1);

		Employee e = new Employee(1, "aniket", 20000);

		System.out.println(l.contains(e));

	}

}
