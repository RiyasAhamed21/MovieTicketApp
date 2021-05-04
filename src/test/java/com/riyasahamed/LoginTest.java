package com.riyasahamed;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoginTest {

	@Test
	/*
	 * In this Test Case Both Mobile Number and Password are entered Wrongly...
	 */

	public void invalidMobileNoAndPasswordTest() {
		Long mobileNo =9345442250l;
		String password ="Riiyas@12";
		UserManager.addUser(mobileNo, password);
		Long mobileNumber = 934544223l;
		String password1 = "asdff";
		String actual = UserValidator.checkUserLogin(mobileNumber, password1);
		String expected = "Invalid Credentials";
		assertEquals(expected, actual);
	}
	/*
	 * In this Test Case  Mobile Number Entered Wrongly...
	 */

	@Test
	public void invlaidMobileNumberTest() {
		Long mobileNo =9345442250l;
		String password ="Riiyas@12";
		UserManager.addUser(mobileNo, password);
		Long mobileNumber = 934544223l;
		String password1 = "Riiyas@12";
		String actual = UserValidator.checkUserLogin(mobileNumber, password1);
		String expected = "Invalid Mobile Number";
		assertEquals(expected, actual);

	}

	/*
	 * In this Test Case Password Entered Wrongly..
	 */
	@Test
	public void invalidPasswordTest() {
		Long mobileNo =9345442250l;
		String password ="Riiyas@12";
		UserManager.addUser(mobileNo, password);
		Long mobileNumber = 9345442250l;
		String password1 = "Riiyas";
		String actual = UserValidator.checkUserLogin(mobileNumber, password1);
		String expected = "Invalid Password";
		assertEquals(expected, actual);
	}

	/*
	 * In this Test Case Both Mobile Number and Password are entered Correctly...
	 */
	@Test
	public void validCredentialsTest() {
		Long mobileNo =9345442250l;
		String password ="Riiyas@12";
		UserManager.addUser(mobileNo, password);
		Long mobileNumber = 9345442250l;
		String password1 = "Riiyas@12";
		String actual = UserValidator.checkUserLogin(mobileNumber, password1);
		String expected = "Valid Credentials";
		assertEquals(expected, actual);
	}
}
