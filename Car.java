/**
 *@author John DiAntonio
 *Date: 11/20/2016
 *Purpose: Car class composed of make, color, horse power, and engine size
 */

public class Car {
	private String make;
	private String color;
	private int horsePower;
	private double engineSize;
	private static int count = 0;
/**
 *Initialize values of Car object to a blue ford, 250 horsepower, and engine size 2.5.
 */

	public Car () {
		make = "Ford";
		color = "Blue";
		horsePower = 250;
		engineSize = 2.5;
		count++;
	}
/**
 *Constructor with parameters
 *@param make a make of a car
 *@param color of the car
 *@param horsePower of the car
 *@param engineSize of the car
 */
	public Car(String make, String color, int horsePower, double engineSize) {
		this.make = make;
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public double getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	public boolean equals(Car obj) {
		boolean status = false;
		status = this.getMake().equals(obj.getMake()) && this.getColor().equals(obj.getColor()) && this.getHorsePower() == obj.getHorsePower() && this.getEngineSize() == obj.getEngineSize();
		return status;
	}
	public String toString() {
		return "Car: " + " Make: " + make + " Color: " + color + " Horse Power: " + horsePower + " Engine Size: " + engineSize;
	}

}	
