package org.tnsif.acc.c2tc.keywordsdemo;

class Notification
{
	String message="Default Notification";
}
class PushNotification extends Notification
{
	String message="Push Notification from whatsapp";
	
	void showNotification()
	{
		System.out.println("Child message "+message);
		System.out.println("Parent message "+super.message);
	}
}
public class SuperOnVarible {

	public static void main(String[] args) {
		PushNotification push=new PushNotification();
		push.showNotification();

	}

}