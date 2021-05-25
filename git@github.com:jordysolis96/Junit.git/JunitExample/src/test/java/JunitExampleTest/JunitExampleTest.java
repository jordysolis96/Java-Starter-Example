package JunitExampleTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.Blackjack;
import com.qa.Calculator;

public class JunitExampleTest {

	
	@Test
	public void addTest() {
		assertEquals(4, Calculator.add(2, 2));
	}
	
	@Test
	public void subTest() {
		assertEquals(10, Calculator.subtract(0, 10));
		assertEquals(4, Calculator.subtract(4, 4));
	}
	
	@Test
	public void multTest() {
		assertEquals(6, Calculator.multiply(2, 3));
		assertEquals(-6, Calculator.multiply(2, -3));
	}
	
	@Test
	public void modTest() {
		assertEquals(2, Calculator.modulus(10, 4));
	}
	
	@Test
	public void bjTest() {
		assertEquals(20, Blackjack.play(20, 20));
	}
	@Test
	public void bjTest2() {		
		assertEquals(0, Blackjack.play(23, 22));
	}
	@Test
	public void bj3() {
		assertEquals(15, Blackjack.play(15, 22));
	}
	@Test
	public void bj4() {
		assertEquals(12, Blackjack.play(22, 12));
	}
	
}
