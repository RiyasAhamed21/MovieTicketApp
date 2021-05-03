package com.riyasahamed;

import java.util.HashMap;

public class UserManager {
	
	static HashMap<String , String> user = new HashMap<String , String>();
	
	
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
	
	public static void addUser(String mobileNo, String password) {
		user.put(mobileNo, password);
	}
	
	public static void removeUser(String mobileNo , String password) {
		user.remove(mobileNo, password);
	}

}
