package in.co.Inheritance;

public class Testing {
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setBorderwidth(10);
		c.setColor("Red");
		c.setRadius(10);
		
		System.out.println(c.getColor()+c.getBorderwidth()+c.getRadius());
		c.area();
		
				
				
		
	}

}
