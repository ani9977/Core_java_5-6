package in.co.OOP;

public class MethodOverloading {

	public void move(int num) {
		System.out.println(num);
	}

	public void move(int num, int num1) {
		System.out.println(num + num1);
	}

	public void move(int num, int num1, int num2) {
		System.out.println(num * num1 * num2);
	}
    public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.move(10);
		m.move(10, 20);
		m.move(20,10,30);
		
    	
    	
	}
}
