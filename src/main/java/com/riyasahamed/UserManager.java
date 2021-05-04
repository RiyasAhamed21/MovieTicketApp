package com.riyasahamed;

import java.util.HashMap;

public class UserManager {

	static HashMap<Long, String> users = new HashMap<Long, String>();

	public static void addUser(Long mobileNo, String password) {
		users.put(mobileNo, password);
	}

	public static void removeUser(Long mobileNo) {
		if (users.containsKey(mobileNo)) {
			users.remove(mobileNo);
		} else {
			System.out.println("Mobile Number Not Registered");
		}
	}

}
