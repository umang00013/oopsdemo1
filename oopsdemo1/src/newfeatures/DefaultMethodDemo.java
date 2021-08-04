package newfeatures;

import java.time.LocalDate;

interface MyInterface
{
	public void square(int a); //abstract method
	
	//default method
	
	default void display(String a)
	{
		System.out.println("Hello" +a);
	}
	//static methods
	static void printDate()
	{
		System.out.println("Today's Date: "+LocalDate.now() );
	}
}
public class DefaultMethodDemo implements MyInterface {
	@Override
	public void square(int a) {
		System.out.println("The sq of number is :"+(a*a));
		
	}

	public static void main(String[] args) {
		
		DefaultMethodDemo d1= new DefaultMethodDemo();
		d1.square(5);
		// call default methods
		d1.display(" Default method");
		//call static method
		MyInterface.printDate();
	}

	

}
