package fizzbuzz;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test15() {
		assertEquals("FizzBuzz", FizzBuzz.fizz(15));
	}

	@Test
	public void test5() {
		assertEquals("Buzz", FizzBuzz.fizz(5));
	}

	@Test
	public void test3() {
		assertEquals("Fizz", FizzBuzz.fizz(3));
	}

	@Test
	public void testNumber() {
		assertEquals("7", FizzBuzz.fizz(7));
	}

	@Test
	public void testRandom() {
		Random random = new Random();
		int randomFigure = random.nextInt(100) + 1;

		if ( randomFigure % 15 == 0) {
			assertEquals("FizzBuzz", FizzBuzz.fizz(randomFigure));
		} else if ( randomFigure % 5 == 0) {
			assertEquals("Buzz", FizzBuzz.fizz(randomFigure));
		} else if ( randomFigure % 3 == 0) {
			assertEquals("Fizz", FizzBuzz.fizz(randomFigure));
		} else {
			String randomNumber = String.valueOf(randomFigure);
			assertEquals( randomNumber, FizzBuzz.fizz(randomFigure));
		}
	}

}
