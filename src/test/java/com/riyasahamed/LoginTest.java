package com.riyasahamed;

public class LoginTest {

	public static void main(String[] args) {

		String mobileNo = UserManager.getMobileNo();
		String password = UserManager.getPassword();
		UserManager.addUser(mobileNo, password);
		invalidMobileNoAndPasswordTest();
		invlaidMobileNumberTest();
		invalidPasswordTest();
		validCredentialsTest();
	}

	public static void invalidMobileNoAndPasswordTest() {
		String mobileNumber = "934544223";
		String password = "asdff";
		String valid = UserValidator.checkUserLogin(mobileNumber, password);
		System.out.println(valid);
	}

	public static void invlaidMobileNumberTest() {
		String mobileNumber = "934544223";
		String password = "Riiyas@12";
		String valid = UserValidator.checkUserLogin(mobileNumber, password);
		System.out.println(valid);

	}

	public static void invalidPasswordTest() {
		String mobileNumber = "9345442250";
		String password = "Riiyas";
		String valid = UserValidator.checkUserLogin(mobileNumber, password);
		System.out.println(valid);
	}

	/*
	 * In this Test Case Both Mobile Number and Password are entered Correctly...
	 */
	public static void validCredentialsTest() {
		String mobileNumber = "9345442250";
		String password = "Riiyas@12";
		String valid = UserValidator.checkUserLogin(mobileNumber, password);
		System.out.println(valid);
	}
}
