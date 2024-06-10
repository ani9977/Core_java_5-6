package in.co.OOP;

public class Automobile {
	private String color;
	private double speed;
	private String make;
	private int numberOfGears;
	private int currentGear;

	public Automobile(String color, double speed, String make, int numberOfGears) {
		this.color = color;
		this.speed = speed;
		this.make = make;
		this.numberOfGears = numberOfGears;
		this.currentGear = 5;
	}

	public String getColor() {
		return color;
	}

	public String getMake() {
		return make;
	}

	public double getSpeed() {
		return speed;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		if (currentGear > 0 && currentGear <= numberOfGears) {
			this.currentGear = currentGear;
			adjustSpeed(); // Adjust speed based on the new gear
		} else {
			System.out.println("Invalid gear number");
		}
	}

	public void displayNumberOfGears() {
		System.out.println("Number of gears: " + numberOfGears);
	}

	private void adjustSpeed() {

		speed = currentGear * 20;
		System.out.println("Speed adjusted to " + speed + " km/h in gear " + currentGear);
	}

	public static void main(String[] args) {

		Automobile car = new Automobile("Red", 0.0, "Toyota", 5);
		car.displayNumberOfGears();
		System.out.println(car.getCurrentGear());
		System.out.println(car.getColor());
		System.out.println(car.getMake());
		car.setCurrentGear(6);
		car.setCurrentGear(1);
		car.setCurrentGear(2);
		car.setCurrentGear(3);
		car.setCurrentGear(4);

	}
}
