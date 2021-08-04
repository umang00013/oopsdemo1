//program to demonstrate working of constructor
package oopsdemo1;

import java.util.Scanner;

class Person
{
	String name,constituency;
	int age;
	Scanner s;
	public Person() {
		
		System.out.println("Voter eligibility app");
		age=0;
		name="";
		constituency="Bengaluru";
		s=new Scanner(System.in);
		}

	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		constituency="Mumbai";
	}
	Person(String n,int a, String c)// pc 3 args
	{
		name=n;
		age=a;
		constituency=c;
	}
	void input()
	{
		System.out.println("Enter your name:");
		name=s.nextLine();
		System.out.println("Enter your age:");
		age=s.nextInt();
		
	}


	 void print()
	 {
	System.out.println("Name is :"+name);
	System.out.println("Age is :"+age);
	System.out.println("Constituency is :"+constituency);
	}
	
	
}

public class PersonTest {

	public static void main(String[] args) {
		
	Person objPerson1=new Person();
	objPerson1.input();
	objPerson1.print();
	
	System.out.println("------------------------------");
	Person objPerson2=new Person("Mike",45);// invokes const with 2 args
	objPerson2.print();
	
	System.out.println("------------------------------");
	Person objPerson3=new Person("Ravi",60,"Delhi");// invokes const with 3 args
	objPerson3.print();
	

	}

}
