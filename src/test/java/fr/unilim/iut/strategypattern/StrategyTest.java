package fr.unilim.iut.strategypattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void testAjouter() {
		Context context = new Context(new OperationAjouter());
		assertEquals(15, context.executeStrategy(10, 5));
	}

	@Test
	public void testSoustraire() {
		Context context = new Context(new OperationSoustraire());
		assertEquals(5, context.executeStrategy(10, 5));
	}

	@Test
	public void testMultiplier() {
		Context context = new Context(new OperationMultiplier());
		assertEquals(50, context.executeStrategy(10, 5));
	}

	@Test
	public void testDiviser() {
		Context context = new Context(new OperationDiviser());
		assertEquals(2, context.executeStrategy(10, 5));
		;
	}

}
