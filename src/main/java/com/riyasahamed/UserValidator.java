package com.riyasahamed;

public class UserValidator {
	/**
	 * This Method Validates the User Credentials for Registration
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
	/*
	 * This Method Validates the User Login
	 */
	
	public static String checkUserLogin(Long mobileNo, String password) {
		String valid = "Invalid Credentials";
		for (Long key : UserManager.users.keySet()) {
			String pass = UserManager.users.get(key);
			if (key.equals(mobileNo) && pass.equals(password)) {
				valid = "Valid Credentials";
			} else if (key.equals(mobileNo) && !pass.equals(password)) {
				valid = "Invalid Password";
			} else if (pass.equals(password) && !key.equals(mobileNo)) {
				valid = "Invalid Mobile Number";
			}
		}
		return valid;
	}
}
