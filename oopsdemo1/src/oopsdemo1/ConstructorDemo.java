package oopsdemo1;

public class ConstructorDemo {
	int id;
	String name;
	float salary;
	ConstructorDemo()//implicit const
	{
		id=0;
		name="";
		salary=5000.00f;
	System.out.println("I am a default constructor");	
	}
	
	void display()
	{
		System.out.println(salary);
	}

	public static void main(String[] args) 
	{
		
		ConstructorDemo cd1=new ConstructorDemo();//invoke implicit const
		ConstructorDemo cd2=new ConstructorDemo();
		ConstructorDemo cd3=new ConstructorDemo();
		cd1.display();
		
/*int a;//variable declaration
int a();//method declaration
int a=10;// variable decl and initialization  */
	}

}
