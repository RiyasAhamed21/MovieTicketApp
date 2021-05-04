package com.riyasahamed;

public class UserValidator {
	/**
	 * This Method Validates the User Credentials
	 * 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
	public static String checkUser(Long mobileNumber, String password) {
		String mobileNumberStr = String.valueOf(mobileNumber);
		String s = "You are Succesfully Registered...";
		if ((mobileNumberStr.trim().length() < 10) && (password.trim().length() < 8)) {
			s = "Invalid Mobile Number and Password";
		} else if (password.trim().length() < 8 || password==null) {
			s = "Invalid Password";
		} else if (mobileNumberStr.length() < 10 || mobileNumberStr==null) {
			s = "Invalid Mobile Number";
		}
		return s;
	}

	public static String checkUserLogin(Long mobileNo, String password) {
		String valid = "Invalid Credentials";
		for (Long key : UserManager.users.keySet()) {
			if (key.equals(mobileNo) && UserManager.users.get(key).equals(password)) {
				valid = "Valid Credentials";
			} else if (key.equals(mobileNo) && !UserManager.users.get(key).equals(password)) {
				valid = "Invalid Password";
			} else if (UserManager.users.get(key).equals(password) && !key.equals(mobileNo)) {
				valid = "Invalid Mobile Number";
			}
		}
		return valid;
	}
}
