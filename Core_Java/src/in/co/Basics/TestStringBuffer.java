package in.co.Basics;

public class TestStringBuffer {
	
	public static void main(String[]args) {
		
		StringBuffer sb = new StringBuffer("aniket");
//		sb.append("chouhan");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(3));
		System.out.println(sb.indexOf("chouhan"));
//		System.out.println(sb.replace(1, 4,"jay"));
		System.out.println(sb.reverse());
		
	}

}
