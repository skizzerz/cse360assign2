package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.add(2);
		calc.add(3);
		calc.add(4);

		assertEquals(10, calc.getTotal());
		assertEquals("0 + 1 + 2 + 3 + 4", calc.getHistory());
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(1);
		calc.subtract(2);
		calc.subtract(3);

		assertEquals(-6, calc.getTotal());
		assertEquals("0 - 1 - 2 - 3", calc.getHistory());
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.multiply(2);
		calc.multiply(2);
		calc.multiply(2);

		assertEquals(8, calc.getTotal());
		assertEquals("0 + 1 * 2 * 2 * 2", calc.getHistory());
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(100);
		calc.divide(2); // 100/2 = 50
		calc.divide(2); // 50/2 = 25
		calc.divide(2); // 25/2 = 12.5 = 12 (integer division)

		assertEquals(12, calc.getTotal());
		assertEquals("0 + 100 / 2 / 2 / 2", calc.getHistory());
	}
	
	@Test
	public void testDivideByZero() {
		Calculator calc = new Calculator();
		calc.add(100);
		calc.divide(0);

		assertEquals(0, calc.getTotal());
		assertEquals("0 + 100 / 0", calc.getHistory());
	}
	
	@Test
	public void testCombination() {
		Calculator calc = new Calculator();
		calc.add(4); // 0+4 = 0
		calc.subtract(2); // 4-2 = 2
		calc.multiply(2); // 2*2 = 4
		calc.add(5); // 4+5 = 9

		assertEquals(9, calc.getTotal());
		assertEquals("0 + 4 - 2 * 2 + 5", calc.getHistory());
	}
}
