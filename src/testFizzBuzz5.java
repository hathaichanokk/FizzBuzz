import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz5 {


	FizzBuzz fizzBuzz = new FizzBuzz();
	String i = fizzBuzz.getString("FizzBuzz");
	@Test
	void input_is_15_expect_FizzBuzz() {
		assertEquals("FizzBuzz", i);
	}

}
