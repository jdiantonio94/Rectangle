import java.util.Scanner;
import java.util.regex.Pattern;

public class CreateMethodDemo {
	public static void main(String[] args) {
		System.out.println("The number you have entered raised to a power of 10 is: " + h(0));
		System.out.println("The two numbers you have entered added together are: " + f(0, 0));
		System.out.println("The three numbers entered will be added together with the first number being rooted, the second number being an absolute value and the third number being raised to the power of the second number : " + g(0, 0, 0));
	}
/**
 *This method will return the value of a number raised to the power of 10
 *For example if x = 2 then the program will return 1024
 *@param the value of x to be returned 
 *@return the value of x raised to the power of 10 
*/
	
	public static double h (double x) {
		int i = 1;
		Scanner keyboard = new Scanner(System.in);
		x = keyboard.nextDouble();
		double product = x;
		while (i<10) {
			product = product *x;
			i++;
		}
		return product;
	
	}
/**
 *This method will add two numbers together
 *For example if x = 2.0 and y =2.0 then the program will return 4.0
 *@param the value of x and y to be added together 
 *@return the value of the sum of x and y
*/
	
	public static double f (double x, double y) {
		Scanner keyboard = new Scanner(System.in);
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		double sum = x + y;
	return sum;
	}
/**
 *This method will return the value of three numbers added together, one that has been made into the square root, the second the absolute value of the number, and the third number raised to the power of the second number.
 *@param the values of all three numbers entered
 *@return the value of the function
*/

	public static double g (double a, double b, double c) {
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
		c = keyboard.nextDouble();
        keyboard.close();
		double sum = sqrt(a) + absolute(b) + pow(c, b);
        return sum;      
        }
/**
 *This method will return the absolute value of a number
 *For example if y =-3 then the program will return 3
 *@param the value of y
 *@return the absolute value of y
*/

	public static double absolute (double y) {
		return (y>=0?y:(-1*y)); 
		}
/**
 *This method will find the square root of a number, t.
 *For example if t = 49 then the program will return 7
 *@param The value of t
 *@return The square root of t
*/
	
	public static double sqrt (double t) {
		double x =1;
		double y=1;
		while (absolute(x-y) < 0.00001) {
			y=x;
			x=0.5*(x+ t/x);
		}
		return t;
	}
/**
 *This method will return the value of a number raised to another number
 *For example, if z = 2 and y = 3 then the program will return 8
 *@param The value of z and y
 *@return The value of z raised to y
*/

	public static double pow (double z, double y) {
		if (y > 0) {
			return (z * pow(z, y-1));
		} else if (y<0) {
			return (1/pow(z, -y));
		} else {
			return 1;
		}
		}
}
