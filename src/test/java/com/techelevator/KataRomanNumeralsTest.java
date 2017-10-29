package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	KataRomanNumerals rome;
	
	@Before
	public void setup() {
		rome = new KataRomanNumerals();
	}
	@Test
	public void oneReturnsI() {
		String numeral = rome.numberToNumeral(1);
		Assert.assertEquals("should be I", "I", numeral);
	}
	
	@Test
	public void twoReturnsII() {
		String numeral = rome.numberToNumeral(2);
		Assert.assertEquals("should be II", "II", numeral);
	}
	
	@Test
	public void threeReturnsIII() {
		String numeral = rome.numberToNumeral(3);
		Assert.assertEquals("should be III", "III", numeral);
	}
	
	@Test
	public void fourReturnsIV() {
		String numeral = rome.numberToNumeral(4);
		Assert.assertEquals("should be IV", "IV", numeral);
	}
	
	@Test
	public void fiveReturnsV() {
		String numeral = rome.numberToNumeral(5);
		Assert.assertEquals("should be V", "V", numeral);
	}
	
	@Test
	public void nineReturnsIX() {
		String numeral = rome.numberToNumeral(9);
		Assert.assertEquals("should be IX", "IX", numeral);
	}
	
	@Test
	public void tenReturnsX() {
		String numeral = rome.numberToNumeral(10);
		Assert.assertEquals("should be X", "X", numeral);
	}
	
	@Test
	public void fortyReturnsXL() {
		String numeral = rome.numberToNumeral(40);
		Assert.assertEquals("should be XL", "XL", numeral);
	}
	
}

