package org.tnsif.acc.c2tc.keywordsdemo;

class Person
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    public void displayDetails()
    {
    	System.out.println("name "+name);
    	System.out.println("age "+age);
    }
}
public class This_Demo {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Alice");
		person.setAge(45);
		person.displayDetails();
		person.setName("Sushma");
		person.setAge(55);
		person.getName();
		person.getAge();
		person.displayDetails();

	}

}