package com.riyasahamed;

public class UserManagerTest {
	
	public static void main(String[] args) {
		Long mobileNo1=9345442250l;
		String password1="Riiyas@12";
		UserManager.addUser(mobileNo1, password1);
		Long mobileNo2=9345443354l;
		String password2="AhamedN12";
		UserManager.addUser(mobileNo2, password2);
		System.out.println(UserManager.users);
		UserManager.removeUser(mobileNo2);
		System.out.println(UserManager.users);
		Long mobileNo3=9345662212l;
		UserManager.removeUser(mobileNo3);		
	}

}
