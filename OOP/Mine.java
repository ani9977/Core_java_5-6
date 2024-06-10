package in.co.OOP;

public class Mine {

	private String name;
	private int age;

	public Mine() {
		System.out.println("default Constructor");
	}
	
	public Mine(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Mine m = new Mine();
		System.out.println(m.getName() + " " + m.getAge());
	}
}
