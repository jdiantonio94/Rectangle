/**
 *@author John DiAntonio
 *Date: 11/21/2016
 *Calculator class composed of overloaded methods to find the sum, average, product, and factorial of an array or an object of numbers
 */
public class Calculator {
	private double total;
	private double product;
	private double average;
	private double nums;
	private double num1;
	private double num2;
	private int i;
	private int h;
	/**
 	 *Calculate the sum of two numbers
 	 *@param num1 first number
 	 *@param num2 second number
	 *@return the sum of the first and second number
 	 */
	public static double findSum(double num1, double num2) {
		return num1+num2;
	}
	/**
 	 *Calculate the sum of an array of numbers with double data type
	 *@param nums an array of numbers with double data type
 	 *@return the sum of the numbers with double data type
	 */
	public static double findSum(double [] nums) {
		double total = 0;
		for (int i=0; i<nums.length; i++) {
			total +=nums[i];
		}
		return total;
	}
	/**
	 *Calculate the sum of an array of numbers with string data type
	 *@param nums an array of numbers with the double string type 
	 *@return the sum of the numbers with string data type
	 */
	public static double findSum(String [] nums) {
		double [] doubleNums = new double[nums.length];
		for (int i=0; i<nums.length; i++) {
			doubleNums[i] = Double.parseDouble(nums[i]);
		}

		return findSum(doubleNums);
	}	
	/**
	 *Calculate the average of two numbers
	 *@param num1 the first number
	 *@param num2 the second number
	 *@return the average of the two numbers 
	 */
	public static double findAverage(double num1, double num2) {
		return num1+num2/2;
	}
	/**
	 *Calculate the average of an array of numbers with double data type
	 *@param nums an array of numbers with double data type
	 *@return the average of the numbers with double data type
	 */
	public static double findAverage(double [] nums) {
		int i= 0;
		double average, sum = 0;
		while (i<nums.length) {
			sum = sum +nums[i];
			i++;
		}
		average = sum/nums.length;
		return average;
	}
	/**
	 *Calculate the average of an array of numbers with string data type
	 *@param nums an array of numbers with string data type
	 *@return the average of the numbers with string data type
	 */
	public static double findAverage(String [] nums) {
		double [] doubleNums = new double[nums.length];
		for (int i=0; i<nums.length; i++) {
			doubleNums[i] = Double.parseDouble(nums[i]);
		}
		return findAverage(doubleNums);
	}
	/**
	 *Calculate the product of two numbers
	 *@param num1 the first number
	 *@param num2 the second number
	 *@return the product of the two numbers
	 */
	public static double findProduct(double num1, double num2) {
		return num1 * num2;
	}
	/**
	 *Calculate the product of an array of numbers with the double data type
	 *@param nums an array of numbers with the double data type
	 *@return the product of the array of numbes with double data type
	 */
	public static double findProduct(double [] nums) {
		double product =1;
		for (int i=0; i<nums.length; i++) {
			product = product * nums[i];
		}
		return product;
	}
	/**
	 *Calculate the product of an array of numbers with string data type
	 *@param nums an array of numbers with string data type
	 *@return the product of the numbers with string type
	 */
	public static double findProduct(String [] nums) {
		double [] doubleNums = new double[nums.length];
		for (int i=0; i<nums.length; i++) {
			doubleNums[i] = Double.parseDouble(nums[i]);
		}
		return findProduct(doubleNums);
	}
	/**
	 *Calculate the factorial of a number 
	 *@param num1 the number to find the factorial of
	 *@return the factorial of num1 with double data type
	 */
	public double findFactorial(double num1) {
		double factorial =1;
		for (int h=1; h<=num1; h++) {
			factorial = factorial * h;
		}
		return factorial;
	}
	/**
	 *Calculate the product of factorials of an array of numbers with double data type
	 *@param nums an array of numbers with double data type
	 *@return the product of the factorials of each number in the array with double data type
	 */
	public double findFactorial(double [] nums) {
		double factorial =1;
		for (int i=0; i<nums.length; i++) {
			for (int h=2; h<=nums[]; h++) {
				factorial = factorial * h;
			}
		}
		return factorial;
	}
	/**
	 *Calculate the product of factorials of an array of numbers with string data type
	 *@param nums an array of numbers with double data type
	 *@return the product of the factorials of each number in the array with string data type
	 */
	public double findFactorial(String [] nums) {
		double [] doubleNums = new double[nums.length];
		for (int i=0; i<nums.length; i++) {
			doubleNums[i] = Double.parseDouble(nums[i]);
		}
		return findFactorial(doubleNums);
	}
}
