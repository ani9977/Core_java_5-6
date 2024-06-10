package in.co.OOP;

public class Person {

	private String name;
	private String address;
	private String city;

	public Person() {
		System.out.println("i'm default Constructor");
	}

	public Person(String name, String address, String city) {

		this.name = name;
		this.address = address;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public static void main(String[] args) {

		Person p = new Person("Raman", "Indore", "Indore");
		System.out.println(p.getName() + p.getCity() + p.getAddress());

	}

}
