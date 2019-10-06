import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz5 {


	FizzBuzz fizzBuzz = new FizzBuzz();
	int i = fizzBuzz.getInt(11);
	
	@Test
	void input_is_11_expect_11() {
		assertEquals(11, i);
	}

}
