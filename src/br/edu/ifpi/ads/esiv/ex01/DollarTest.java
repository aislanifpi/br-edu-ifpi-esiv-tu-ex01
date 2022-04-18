package br.edu.ifpi.ads.esiv.ex01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DollarTest {
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(3);
		assertEquals(15,five.amount);
	}
	
}
