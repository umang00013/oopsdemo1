package oopsdemo1;
import java.util.Scanner;

class Employee
{
	String name,address;
	int year,salary;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name ");
		name=sc.next();
		System.out.println("Enter Address ");
		address=sc.next();
		System.out.println("Enter Year of joining ");
		year=sc.nextInt();
		System.out.println("Enter Salary ");
		salary=sc.nextInt();
	}
	
	public void show()
	{
	System.out.println(name+"\t"+year+"\t\t"+address+"\t"+salary);
	}
}

public class RunEmployee {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.input();
		e2.input();
		e3.input();
		
		System.out.println("Name\tYear of Joining\tAddress\tSalary\n");
		e1.show();
		e2.show();
		e3.show();
	}

}
