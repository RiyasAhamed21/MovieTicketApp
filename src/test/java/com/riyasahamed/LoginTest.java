package com.riyasahamed;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {

		@Test
		/*
		 * In this Test Case Mobile Number and Password are wrongly Entered
		 */
		public void invalidMobileNoAndPasswordTest() {
			String mobileNumber = "934544223";
			String password = "asdff";
			String actual = UserValidator.checkUserLogin(mobileNumber, password);
			String expected = "Invalid Mobile Number and Password";
			assertEquals(actual, expected);
		}

		@Test
		/*
		 * In this Test Case Mobile Number is Wrongly Entered...
		 */
		public void invlaidMobileNumberTest() {
			String mobileNumber = "934544223";
			String password = "Riiyas@12";
			String actual = UserValidator.checkUserLogin(mobileNumber, password);
			String expected = "Invalid Mobile Number";
			assertEquals(actual, expected);

		}

		@Test
		/*
		 * In this Test Case Password is Wrongly Entered...
		 */
		public void invalidPasswordTest() {
			String mobileNumber = "9345442250";
			String password = "Riiyas";
			String actual = UserValidator.checkUserLogin(mobileNumber, password);
			String expected = "Invalid Password";
			assertEquals(actual, expected);
		}

		@Test
		/*
		 * In this Test Case Both Mobile Number and Password are entered Correctly...
		 */
		public void validCredentialsTest() {
			String mobileNumber = "9345442251";
			String password = "Riiyas@12";
			String actual = UserValidator.checkUser(mobileNumber, password);
			String expected = "You are Succesfully Registered...";
			assertEquals(actual, expected);
		}
	}

}
