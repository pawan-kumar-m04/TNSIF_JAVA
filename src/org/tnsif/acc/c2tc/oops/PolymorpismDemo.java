package org.tnsif.acc.c2tc.oops;



public class PolymorpismDemo 
{
	int inSum(int a, int b) 
	{
		return a+b;
	}
	
	int inSum(int a, int b, int c) 
	{
		return a+b+c;
	}
	
	public static void main(String[] args) 
	{
		PolymorpismDemo obj = new PolymorpismDemo();
		System.out.println(obj.inSum(12,43));
		System.out.println(obj.inSum(2, 4,1));
	}
}
