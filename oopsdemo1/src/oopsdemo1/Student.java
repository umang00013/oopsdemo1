package oopsdemo1;
import java.util.Scanner;

public class Student {

	// properties 
	
	int rollNumber;
	String name,course;
	float m1,m2,m3,total;
	Scanner s= new Scanner(System.in);
	
	
	// methods
	
	void input()
	{
		System.out.println("Enter RollNo,name,course:");
		rollNumber=s.nextInt();
		name=s.next();
		course=s.next();
		
		System.out.println("Enter marks of three subjects:");
		m1=s.nextFloat();
		m2=s.nextFloat();
		m3=s.nextFloat();
		
	}
	
	float calculate()
	{
		total=m1+m2+m3;
		return total;
		
	}
	void display()
	{
		System.out.println("****Student details****");
		System.out.println("RollNo" +rollNumber);
		System.out.println("Name" +name);
		System.out.println("Course" +course);
		System.out.println("Total" +total);
		System.out.println("************");
	}

}
	

	
	
	
	
	
	
	
