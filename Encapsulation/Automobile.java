package in.co.Encapsulation;

public class Automobile {
	private String color;
	private double speed;
	private String make;
	private int numberOfGears;

	public Automobile(String color, double speed, String make, int numberOfGears) {
		this.color = color;
		this.speed = speed;
		this.make = make;
		this.numberOfGears = numberOfGears;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Getter method for speed
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void displayNumberOfGears() {
		System.out.println("Number of gears: " + numberOfGears);
	}

	public static void main(String[] args) {

		Automobile car = new Automobile("Red", 0.0, "Toyota", 5);

		System.out.println("Color: " + car.getColor());
		System.out.println("Speed: " + car.getSpeed());
		System.out.println("Make: " + car.getMake());
		car.displayNumberOfGears();
	}

	public void setCurrentGear(int i) {
		// TODO Auto-generated method stub
		
	}
}
