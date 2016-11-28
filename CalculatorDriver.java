import java.util.Scanner;

public class CalculatorDriver{ 
	
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter numbers separated by a space.");		
		Calculator calculation = new Calculator();
		String input = keyboard.nextLine();
		String [] nums;
		nums = input.split(" ");
		double a = calculation.findSum(nums);
		double b = calculation.findAverage(nums);
		double c = calculation.findProduct(nums);
		double d = calculation.findFactorial(nums);
		System.out.println("The Sum of the numbers is: " + a);
		System.out.println("The Average of the numbers is: " + b);
		System.out.println("The Product of the numbers is: " + c);
		System.out.println("The Product of each Factorial of the numbers are: " +d);
	}
}
