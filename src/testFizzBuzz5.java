import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz5 {


	FizzBuzz fizzBuzz = new FizzBuzz();
	int i = fizzBuzz.getInt(13);
	@Test
	void input_is_13_expect_13() {
		assertEquals(13, i);
	}

}
