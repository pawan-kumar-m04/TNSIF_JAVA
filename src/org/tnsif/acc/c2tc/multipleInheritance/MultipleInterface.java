package org.tnsif.acc.c2tc.multipleInheritance;

class SmartPhone implements InterfaceCamera,InterfaceMusicPlayer{

	@Override
	public void playMusic() {
		System.out.println("Playing music");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo");
		
	}
	
}

public class MultipleInterface {
	
	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone();
		smartphone.playMusic();
		smartphone.takePhoto();
	}
}
