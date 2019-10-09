import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz5 {


	FizzBuzz fizzBuzz = new FizzBuzz();
	String i  = fizzBuzz.getString(1);
	String i2  = fizzBuzz.getString(2);
	String i3  = fizzBuzz.getString(3);
	String i4  = fizzBuzz.getString(4);
	
	@Test
	void input_is_1_expect_1() {
		assertEquals(1, i);
	}
	
	@Test
	void input_is_2_expect_2() {
		assertEquals(2, i2);
	}
	@Test
	void input_is_3_expect_Fizz() {
		assertEquals("Fizz", i3);
	}
	
	@Test
	void input_is_4_expect_4() {
		assertEquals(4, i4);
	}


}
