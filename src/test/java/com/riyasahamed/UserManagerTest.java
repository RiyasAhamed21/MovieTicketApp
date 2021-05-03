package com.riyasahamed;

public class UserManagerTest {
	
	public static void main(String[] args) {
		String mobileNo1="9345442250";
		String password1="Riiyas@12";
		UserManager.addUser(mobileNo1, password1);
		String mobileNo2="9345443354";
		String password2="AhamedN12";
		UserManager.addUser(mobileNo2, password2);
		System.out.println(UserManager.user);
		UserManager.removeUser(mobileNo2, password2);
		System.out.println(UserManager.user);
		
	}

}
