package in.co.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {

		Vector list = new Vector();

		list.addElement("aniket");
		list.addElement("sachin");
		list.addElement("bhaskar");

		Enumeration a = list.elements();

		while (a.hasMoreElements()) {

			System.out.println(a.nextElement());

		}

	}

}
