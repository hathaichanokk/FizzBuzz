import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz5 {


	FizzBuzz fizzBuzz = new FizzBuzz();
	int i = fizzBuzz.getInt(7);
	
	@Test
	void input_is_7_expect_7() {
		assertEquals(7, i);
	}

}
