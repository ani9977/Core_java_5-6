package in.co.Basics;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args)throws Exception {
		
		Date d = new Date();
		SimpleDateFormat sb = new SimpleDateFormat("dd/MM/yyyy");
		String str = sb.format(d);
		System.out.println(str);
		
		String str1 = "22/09/2002";
		Date d1	= sb.parse(str1);
		System.out.println(d1);
		
		
	}
	
	
	
}
