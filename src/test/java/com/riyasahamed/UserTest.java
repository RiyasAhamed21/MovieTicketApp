package com.riyasahamed;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	/*
	 * In this Test Case Mobile Number and Password are wrongly Entered
	 */
	public void testcase1() {
		String mobileNumber = "934544223";
		String password = "asdff";
		String actual = User.checkLogin(mobileNumber, password);
		String expected = "Invalid Mobile Number and Password";
		assertEquals(actual, expected);
	}

	@Test
	/*
	 * In this Test Case Mobile Number is Wrongly Entered...
	 */
	public void testcase2() {
		String mobileNumber = "934544223";
		String password = "Riiyas@12";
		String actual = User.checkLogin(mobileNumber, password);
		String expected = "Invalid Mobile Number";
		assertEquals(actual, expected);

	}

	@Test
	/*
	 * In this Test Case Password is Wrongly Entered...
	 */
	public void testcase3() {
		String mobileNumber = "9345442250";
		String password = "Riiyas";
		String actual = User.checkLogin(mobileNumber, password);
		String expected = "Invalid Password";
		assertEquals(actual, expected);
	}

	@Test
	/*
	 * In this Test Case Both Mobile Number and Password are entered Correctly...
	 */
	public void testcase4() {
		String mobileNumber = "9345442251";
		String password = "Riiyas@12";
		String actual = User.checkLogin(mobileNumber, password);
		String expected = "You are Succesfully Logged In...";
		assertEquals(actual, expected);
	}
}