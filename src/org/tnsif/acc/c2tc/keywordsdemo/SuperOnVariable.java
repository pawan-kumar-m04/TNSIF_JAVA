package org.tnsif.acc.c2tc.keywordsdemo;

class Payment
{
	void process()
	{
		System.out.println("Processing payment using standard gateway");
	}
}

class GPay extends Payment
{
	void process()
	{
		System.out.println("Processing payment via google pay ");
	}
	
	void completeTransaction()
	{
		super.process();
		process();
	}
}

public class SuperOnVariable {

	public static void main(String[] args) {
		GPay gpay=new GPay();
		gpay.completeTransaction();

	}

}