package in.co.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");

//		System.out.println(m);
//		System.out.println(m.get(2));

		for (Object obj : m.entrySet()) {
			Map.Entry entry = (Map.Entry) obj;
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("keys:" + key + "=" + "values:" + value);
		}
//		
//		for (Object value : m.values()) {
//            System.out.println("Value: " + value);
//        }

	}

}
