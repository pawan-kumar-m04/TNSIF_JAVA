package org.tnsif.acc.c2tc.keywordsdemo;

class User
{
	User()
	{
		System.out.println("User Account created");
	}
}
class AdminUser extends User
{
	AdminUser()
	{
		super();
		System.out.println("Admin privileges granted");
	}
}

public class SuperOnConstructor {

	public static void main(String[] args) {
		AdminUser admin=new AdminUser();

	}

}