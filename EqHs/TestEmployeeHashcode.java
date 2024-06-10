package in.co.EqHs;

import java.util.HashMap;
import java.util.Map;

public class TestEmployeeHashcode {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 1000);

		Employee e2 = new Employee(1, "abc", 10000);

		System.out.println(e1);
		System.out.println(e2);
		
		
		System.out.println(e1.hashCode() == e2.hashCode());

	}

}