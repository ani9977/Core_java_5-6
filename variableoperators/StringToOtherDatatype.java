package in.co.variableoperators;

public class StringToOtherDatatype {

	public static void main(String[] args) {

		String str1 = "5abc";

		int i = Integer.parseInt(str1);

		String str2 = "5.5";

		double d = Double.parseDouble(str2);

		String str3 = "5.5";

		float f = Float.parseFloat(str3);

		String str4 = "10000";

		long l = Long.parseLong(str4);

		String bstr = "10";

		Boolean b = Boolean.parseBoolean(bstr);

		System.out.println(i);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(b);

	}

}
