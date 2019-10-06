import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz5 {


	FizzBuzz fizzBuzz = new FizzBuzz();
	String i = fizzBuzz.getString("Fizz");
	@Test
	void input_is_12_expect_Fizz() {
		assertEquals("Fizz", i);
	}

}
