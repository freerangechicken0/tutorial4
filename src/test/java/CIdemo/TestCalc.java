package CIdemo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {
	@Test
	public void testAdd() {
		assertEquals(15, new Calc().add(10, 5));
	}
}