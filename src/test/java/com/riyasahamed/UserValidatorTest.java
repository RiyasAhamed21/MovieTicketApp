package com.riyasahamed;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserValidatorTest {

	@Test
	/*
	 * In this Test Case Mobile Number and Password are wrongly Entered
	 */
	public void invalidMobileNoAndPasswordTest() {
		Long mobileNumber = 934544223l;
		String password = "asdff";
		String actual = UserValidator.checkUser(mobileNumber, password);
		String expected = "Invalid Mobile Number and Password";
		assertEquals(expected, actual);
	}

	@Test
	/*
	 * In this Test Case Mobile Number is Wrongly Entered...
	 */
	public void invlaidMobileNumberTest() {
		Long mobileNumber = 934544223l;
		String password = "Riiyas@12";
		String actual = UserValidator.checkUser(mobileNumber, password);
		String expected = "Invalid Mobile Number";
		assertEquals(expected, actual);

	}

	@Test
	/*
	 * In this Test Case Password is Wrongly Entered...
	 */
	public void invalidPasswordTest() {
		Long mobileNumber = 9345442250l;
		String password = "Riiyas";
		String actual = UserValidator.checkUser(mobileNumber, password);
		String expected = "Invalid Password";
		assertEquals(expected, actual);
	}

	@Test
	/*
	 * In this Test Case Both Mobile Number and Password are entered Correctly...
	 */	
	public void testWithValidCredentials() {
		Long mobileNumber=9345442250l;
		String password = "Riiyas@12";
		String actual = UserValidator.checkUser(mobileNumber, password);
		String expected = "You are Succesfully Registered...";
		assertEquals(expected, actual);
	}
}