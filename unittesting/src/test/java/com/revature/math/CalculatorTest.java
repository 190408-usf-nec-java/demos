package com.revature.math;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.*;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;

public class CalculatorTest {

	private Calculator calc = new Calculator();
	
	
	@Test
	public void addTest() {
		//2+4 should be 6
		assertThat(calc.add(2d,4d), is(equalTo(6d)));
		assertThat(calc.add(-4d, -6d), is(equalTo(-10d)));

	}
	
	@Test
	public void subTest() {
		//2+4 should be 6
		assertThat(calc.sub(2d,4d), is(equalTo(-2d)));
		assertThat(calc.sub(-4d, -6d), is(equalTo(2d)));

	}
	
	@Test
	public void multTest() {
		//2+4 should be 6
		assertThat(calc.mult(2d,4d), is(equalTo(8d)));
		assertThat(calc.mult(-4d, -6d), is(equalTo(24d)));

	}
	
	@Test
	public void divTest() {
		//2+4 should be 6
		assertThat(calc.div(2d,4d), is(equalTo(.5d)));
		assertThat(calc.div(-4d, -4d), is(equalTo(1d)));
		assertThat(calc.div(4d, 0d), is(equalTo(Double.POSITIVE_INFINITY)));

	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("Before Each");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("After each");
	}
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
