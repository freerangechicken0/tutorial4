package CIdemo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {
	@Test
	public void testAdd() {
		assertEquals(15, new Calc().add(10, 5));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(15, new Calc().subtract(20, 5)):
	}
}