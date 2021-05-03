package com.riyasahamed;

public class UserValidator {
	/**
	 * This Method Validates the User Credentials
	 * 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
	public static String checkUser(String mobileNumber, String password) {
		String mobileNumberStr = String.valueOf(mobileNumber);
		String s = "You are Succesfully Registered...";
		if ((mobileNumberStr.length() < 10) && (password.length() < 8)) {
			s = "Invalid Mobile Number and Password";
		} else if (password.length() < 8) {
			s = "Invalid Password";
		} else if (mobileNumberStr.length() < 10) {
			s = "Invalid Mobile Number";
		}
		return s;
	}

	public static String checkUserLogin(String mobileNo, String password) {
		String valid = "Invalid Credential";
		for (String key : UserManager.user.keySet()) {
			if (key.equals(mobileNo) && UserManager.user.get(key).equals(password)) {
				valid = "Valid Credential";
			} else if (key.equals(mobileNo) && !UserManager.user.get(key).equals(password)) {
				valid = "Invalid Password";
			} else if (UserManager.user.get(key).equals(password) && !key.equals(mobileNo)) {
				valid = "Invalid Username";
			}
		}
		return valid;
	}
}
