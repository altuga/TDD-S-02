package com.kodcu.katas.stringhesapmakinasi;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHesapMakinasiTest {
	StringHesapMakinasi calculator = new StringHesapMakinasi();

	private void checkAdd(String string, int expected) {
		assertEquals(expected, calculator.add(string));
	}

	@Test
	public void shouldReturnBasicValues() {

		assertEquals(0, calculator.add(""));
		assertEquals(1, calculator.add("1"));

	}

	@Test
	public void shouldReturnSum() throws Exception {

		assertEquals(3, calculator.add("1,2"));

	}


}
