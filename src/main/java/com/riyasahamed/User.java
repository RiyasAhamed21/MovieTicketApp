package com.riyasahamed;

public class User {
	
	/** This Method Validates the User Credentials
	 * @param mobileNumber
	 * @param password
	 * @return
	 */
	public static String checkLogin(String mobileNumber, String password) {
		String mobileNumberStr=String.valueOf(mobileNumber);
		String s="You are Succesfully Logged In...";
		if((mobileNumberStr.length()<10)&&(password.length()<8)) {
			s="Invalid Mobile Number and Password";
		}
		else if(password.length()<8) {
			s="Invalid Password";
		}
		else if(mobileNumberStr.length()<10)
		{
			s="Invalid Mobile Number";
		}
		return s;		
	}
	
	/**
	 * @return
	 */
	public static String getMobileNo() {
		String mobileNo="9345442250";
		return mobileNo;
	}
	
	public static String getPassword() {
		String password="Riiyas@12";
		return password;
	}

}
