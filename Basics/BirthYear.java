package in.co.Basics;

import java.time.LocalDate;
import java.time.Period;

public class BirthYear {
// yeh code birth year nikalta hai 
	public static void main(String[] args) {

//		int birth = 2002;
//		int currentyear = LocalDate.now().getYear();
//		int age = currentyear - birth;
//		System.out.println("your approx age:" + age + "year old");

		LocalDate birthDate = LocalDate.of(2002, 10, 02); // Example birth date: 2002-06-01

		// Current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the period between birth date and current date
		Period age = Period.between(birthDate, currentDate);

		// Output the exact age in years, months, and days
		System.out.println("Your exact age: " + age.getYears() + " years, " + age.getMonths() + " months, and "
				+ age.getDays() + " days old.");

	}

}
