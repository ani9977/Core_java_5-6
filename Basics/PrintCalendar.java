package in.co.Basics;

import java.time.LocalDate;

import java.time.LocalDate;

public class PrintCalendar {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int lengthOfMonth = date.lengthOfMonth();

		System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		for (int i = 1; i <= lengthOfMonth; i++) {
			System.out.printf("%5d", i);
			if (date.withDayOfMonth(i).getDayOfWeek().getValue() == 6) {
				System.out.println();
			}
		}
	}
}
