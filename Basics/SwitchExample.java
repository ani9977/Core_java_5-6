package in.co.Basics;

public class SwitchExample {

	public static void main(String[] args) {
		int number = 12;
		String day;

		switch (number) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid day";
			break;
		}

		System.out.println("The day is " + day);
	}
}
