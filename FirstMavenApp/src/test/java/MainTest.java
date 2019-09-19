

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class MainTest {

	@Test
	public void getSumTest() {
		int result = Main.getSum(12, 13);
		Assert.assertEquals(25, result);
	}

	@Test
	public void getSumLongTest() {
		try { 
			Main.getSum(2_000_000_000, 2_000_000_000);
			Assert.fail("exp - ArithmeticException");
		} catch (ArithmeticException e) {}
	}
	
	@Test
	public void getSumZeroTest() {
		Assert.assertEquals(0,  Main.getSum(0, 0));
	}
}
