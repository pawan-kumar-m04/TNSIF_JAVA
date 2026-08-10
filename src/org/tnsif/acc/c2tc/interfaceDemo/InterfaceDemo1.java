package org.tnsif.acc.c2tc.interfaceDemo;

class SmartLight implements SmartDevice
{

	@Override
	public void turnOn() {
		System.out.println("SmartLight is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("SmartLight is off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("SmartLight is on standby mode");
	}
	
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		SmartDevice smart=new SmartLight();
		smart.turnOn();
		smart.turnOff();
		smart.getStatus();

	}

}