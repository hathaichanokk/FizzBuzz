import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz5 {


	FizzBuzz fizzBuzz = new FizzBuzz();
	String i = fizzBuzz.getString("Buzz");
	
	@Test
	void input_is_10_expect_Fizz() {
		assertEquals("Buzz", i);
	}

}
