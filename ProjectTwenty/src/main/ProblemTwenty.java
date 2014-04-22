package main;
import java.math.BigInteger;

public class ProblemTwenty {

	/**
	 *  Project Euler, Problem 20
	 *  Factorial Digit Sum
	 *  Scott Gilmour
	 */
	public static void main(String[] args) {
		System.out.println("The sum of the digits in 100! is " + sumOfDigits(100));
	}
	
	public static int sumOfDigits(int k) {
		String fact = factorial(BigInteger.valueOf(k)).toString();
		int sum = 0;
		
		for (char c : fact.toCharArray()) {
			sum += Character.getNumericValue(c);
		}
		
		return sum;
	}
	
	/**
	 * @param n : the integer to factor 
	 */
	public static BigInteger factorial(BigInteger n) {
		BigInteger result = n;
		n = n.subtract(BigInteger.ONE);
		
		for (int i = n.intValue(); i > 0; i--)
			result = result.multiply(BigInteger.valueOf(i));	
		
		return result;
	}
}
