import java.util.Scanner;

public class MathClassDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter two numbers, the first number being the base and the second number being the exponent");
		double base = keyboard.nextDouble();
		double exponent = keyboard.nextDouble();
		System.out.println(Math.pow(base, exponent));
		System.out.println("Please enter a number to be square rooted");
		double sqrt = keyboard.nextDouble();
		System.out.println(Math.sqrt(sqrt));
		System.out.println("Please enter a number to have it's absolute value taken");
		double absoluteval = keyboard.nextDouble();
		System.out.println(Math.abs(absoluteval));
		System.out.println("A random number between 0.0 and 1.0 will be displayed: " + Math.random());
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		System.out.println("The two numbers entered will be compared, the larger number will be displayed: " + Math.max(a, b));
		double c = keyboard.nextDouble();
		double d = keyboard.nextDouble();
		System.out.println("The two numbers entered will be compared, the smaller number will be displayed: " + Math.min(c, d));
		System.out.println("Please enter a decimal number to be rounded: ");
		double round = keyboard.nextDouble();
		System.out.println(Math.round(round));
		System.out.println("Please enter a number to be compared: ");
		double ceil = keyboard.nextDouble();
		System.out.println(Math.ceil(ceil));
		System.out.println("Please enter a number to be compared: ");
		double floor = keyboard.nextDouble();
		System.out.println(Math.floor(floor));
	}

}
