package com.riyasahamed;

import java.util.HashMap;

public class UserManager {

	static HashMap<Long, String> users = new HashMap<Long, String>();

	/*
	 * This Method is used to add the  User
	 */
	public static void addUser(Long mobileNo, String password) {
		users.put(mobileNo, password);
	}
	/*
	 * This Method is used to Remove the User
	 */
	
	public static void removeUser(Long mobileNo) {
		if (users.containsKey(mobileNo)) 
		{
			users.remove(mobileNo);
		} 
		else 
		{
			System.out.println("Mobile Number Not Registered");
		}
	}

}
