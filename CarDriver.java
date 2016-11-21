public class CarDriver {
	public static void main(String [] args) {
		Car myCar = new Car();
		Car hisCar = new Car("Honda", "Black", 400, 3.5);
		Car herCar = new Car("Volks", "Pink", 300, 2.5);
			
		System.out.println(myCar + "\n");
		System.out.println(hisCar + "\n");
		System.out.println(herCar + "\n");

		myCar.setMake("Ferrari");
		hisCar.setMake("Ferrari");
		herCar.setMake("Ferrari");

		myCar.setColor("Blue");
		hisCar.setColor("Blue");
		herCar.setColor("Blue");

		myCar.setHorsePower(650);
		hisCar.setHorsePower(650);
		herCar.setHorsePower(650);

		myCar.setEngineSize(6.5);
		hisCar.setEngineSize(6.5);
		herCar.setEngineSize(6.5);

		System.out.println(myCar.getMake() + " " + myCar.getColor() + " " + myCar.getHorsePower() + " " + myCar.getEngineSize());
		System.out.println(hisCar.getMake() + " " + hisCar.getColor() + " " + hisCar.getHorsePower() + " " + hisCar.getEngineSize());
		System.out.println(herCar.getMake() + " " + herCar.getColor() + " " + herCar.getHorsePower() + " " + herCar.getEngineSize());
	}
}
