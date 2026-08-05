package org.tnsif.acc.c2tc.scanner;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		//String name = sc.nextLine();
		//System.out.println(name);
		//char index = name.charAt(3);
		char inde = sc.next().charAt(1);
		//System.out.println(index);
		System.out.println(inde);
		
		System.out.println("Are u a student");
		boolean sn = sc.nextBoolean();
		System.out.println(sn);
		
		System.out.println("Enter Y");
		sc.close();  
	}

}
