package Tests;

import static org.junit.Assert.*;
import java.math.BigInteger;
import main.ProblemTwenty;
import org.junit.Test;


public class P20Test {
	@Test
	public void testFactorial() {
		BigInteger n = BigInteger.TEN;
		
		BigInteger expected = BigInteger.valueOf(3628800);
		BigInteger result = ProblemTwenty.factorial(n);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testSumOfDigits() {
		int n = 10;
		
		int expected = 27;
		int result = ProblemTwenty.sumOfDigits(n);
		
		assertEquals(expected, result);
	}
}
