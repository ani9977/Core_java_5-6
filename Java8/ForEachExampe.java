package in.co.Java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachExampe {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("shyam");
		list.add("mohan");
		list.add("vicky");
		list.forEach(li -> System.out.println(li));
	}

}
