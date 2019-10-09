import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz5 {


	FizzBuzz fizzBuzz = new FizzBuzz();
	String i  = fizzBuzz.getString(1);
	String i2  = fizzBuzz.getString(2);
	String i3  = fizzBuzz.getString(3);
	String i4  = fizzBuzz.getString(4);
	String i5  = fizzBuzz.getString(5);
	String i6  = fizzBuzz.getString(6);
	String i7  = fizzBuzz.getString(7);
	String i8  = fizzBuzz.getString(8);
	String i9  = fizzBuzz.getString(9);
	String i10  = fizzBuzz.getString(10);
	
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
	@Test
	void input_is_5_expect_Buzz() {
		assertEquals("Buzz", i5);
	}
	@Test
	void input_is_6_expect_Fizz() {
		assertEquals("Fizz", i6);
	}
	@Test
	void input_is_7_expect_7() {
		assertEquals(7, i7);
	}
	@Test
	void input_is_8_expect_8() {
		assertEquals(8, i8);
	}
	@Test
	void input_is_9_expect_Fizz() {
		assertEquals("Fizz", i9);
	}
	@Test
	void input_is_10_expect_Buzz() {
		assertEquals("Buzz", i10);
	}
	

}
