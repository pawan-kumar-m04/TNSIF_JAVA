package org.tnsif.acc.c2tc.interfaceDemo;

public class MarkerInterfaceDemo {
	
	public static void main(String[] args) {
		Registration s = new Student(12,"Sushma",300000.00,"java Programming");
		Registration s1 = new Student(1,"Sushma",300000.00,"java Programming");
		
		if(s1 instanceof Registration)
		{
			System.out.println("Student is registred for the course");
		}
		else
		{
			System.out.println("Student is not registred for the course");
		}
	}
}
