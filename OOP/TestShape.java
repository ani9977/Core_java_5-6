package in.co.OOP;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();
		s.setBorderwidth(10);
		s.setColor("Blue");
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());

	}

}
