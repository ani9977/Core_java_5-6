package in.co.Basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws Exception {
		
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println(str);
		
		
		String str1 = "26/11/2022";
		Date d1 = format.parse(str1);
		System.out.println(d1);

	}

}
