package in.co.Encapsulation;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String name;
	private LocalDate dob;
	private String address;

	public Person(String name, LocalDate dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter method for dob
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		LocalDate currentDate = LocalDate.now();
		return Period.between(dob, currentDate).getYears();
	}

	public static void main(String[] args) {

		LocalDate dob = LocalDate.of(2002, 02, 10);
		Person person = new Person("aniket", dob, "Indore");

		System.out.println("Name: " + person.getName());
		System.out.println("Date of Birth: " + person.getDob());
		System.out.println("Address: " + person.getAddress());
		System.out.println("Age: " + person.getAge());
	}
}
