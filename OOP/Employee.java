package in.co.OOP;

public class Employee {

	private String name;
	private int age;
	private String address;

	public Employee(String name, int age, String address) {

		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {

		Employee e = new Employee("aniket", 22, "Indore");
		System.out.println(e.getName() + " " + e.getAge() + " " + e.getAddress());
	}

}
