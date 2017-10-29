package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {
	
	KataPotter pot;
	
	@Before
	public void setup() {
		pot = new KataPotter();
	}
	
	@Test
	public void oneBookShouldBe8() {
		int[] books = new int[] {1};
		double cost = pot.getCost(books);
		Assert.assertEquals("cost should be 8.00", 8.00, cost, .01);
	}
	
	@Test
	public void twoBooksShouldBe1520() {
		int[] books = new int[] {1, 1};
		double cost = pot.getCost(books);
		Assert.assertEquals("cost should be 15.20", 15.20, cost, .01);
	}
	
	@Test
	public void threeBooksShouldBe2160() {
		int[] books = new int[] {1, 1, 1};
		double cost = pot.getCost(books);
		Assert.assertEquals("cost should be 21.60", 21.60, cost, .01);
	}
	
	@Test
	public void fourBooksShouldBe2560() {
		int[] books = new int[] {1, 1, 1, 1};
		double cost = pot.getCost(books);
		Assert.assertEquals("cost should be 25.60", 25.60, cost, .01);
	}
	
	@Test
	public void fiveBooksShouldBe30() {
		int[] books = new int[] {1, 1, 1, 1, 1};
		double cost = pot.getCost(books);
		Assert.assertEquals("cost should be 30.00", 30.00, cost, .01);
	}
	
	@Test
	public void twoOfTheSameBooksShouldBe16() {
		int[] books = new int[] {2};
		double cost = pot.getCost(books);
		Assert.assertEquals("cost should be 16.00", 16.00, cost, .01);
	}
	
	@Test
	public void hardestTestCase() {
		int[] books = new int[] {2, 2, 2, 1, 1};
		double cost = pot.getCost(books);
		Assert.assertEquals("cost should be 51.20", 51.20, cost, .01);

	}
}
