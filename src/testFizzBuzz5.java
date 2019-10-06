import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz5 {


	FizzBuzz fizzBuzz = new FizzBuzz();
	int i = fizzBuzz.getInt(14);
	@Test
	void input_is_14_expect_14() {
		assertEquals(14, i);
	}

}
