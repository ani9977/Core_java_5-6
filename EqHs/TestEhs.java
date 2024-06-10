package in.co.EqHs;

public class TestEhs {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "ab";

		System.out.println( s1.equals(s2));
		System.out.println(s1.hashCode());

		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode() == s2.hashCode());
	}

}
