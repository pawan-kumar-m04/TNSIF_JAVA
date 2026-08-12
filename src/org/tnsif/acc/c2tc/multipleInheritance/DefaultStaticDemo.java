package org.tnsif.acc.c2tc.multipleInheritance;


interface Vehicle
{
	void start();
	void stop();
	int Max_speed=120;
	
	default void repair()
	{
		System.out.println("Vehicle repare done here");
	}
	
	static void checkMaintanance() {
		System.out.println("Vehicle maintainance take care here:");
	}
}

class Car implements Vehicle
{
	private String model;
	
	Car(String model)
	{
	this.model=model;
	}

	@Override
	public void start() {
		System.out.println("Car-->"+model+"  starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Car-->"+model+"  stoppinng");
		
	}
	
}

class Bike implements Vehicle
{
	private String type;
	Bike(String type)
	{
		this.type=type;
	}
	@Override
	public void start() {
		System.out.println("Bike-->"+type+"  starting");
		
	}
	@Override
	public void stop() {
		System.out.println("Bike-->"+type+"  stopping");
		
	}
}

public class DefaultStaticDemo {

	public static void main(String[] args) {
		Vehicle car = new Car("tata sierra");
		Vehicle bike = new Bike("Royal Enfiled");
		
		car.start();
		car.stop();
		car.repair();
		
		System.out.println("---------------------");
		
		bike.start();
		bike.stop();
		bike.repair();
		
		System.out.println("---------------------");
		
		Vehicle.checkMaintanance();
		
		System.out.println("---------------------");
		
		System.out.println("Max Speed:");
		
		System.out.println(Vehicle.Max_speed);
		

	}

}
