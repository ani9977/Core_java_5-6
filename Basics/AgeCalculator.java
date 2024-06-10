package in.co.Basics;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

	public static void main(String[] args) {
		// Define the birthdate and current date
		String birthdateString = "2002-01-10"; // Example birthdate
		String currentDateString = "2024-05-25"; // Example current date

		// Parse the birthdate and current date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate birthdate = LocalDate.parse(birthdateString, formatter);
		LocalDate currentDate = LocalDate.parse(currentDateString, formatter);

		// Calculate the age
		Period age = Period.between(birthdate, currentDate);

		// Output the age
		System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays()
				+ " days old.");
	}
}
