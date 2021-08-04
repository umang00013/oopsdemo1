package oopsdemo3;
class Hello
{
	final void display()
	{
		System.out.println("This is a final method");
	}

//class World extends Hello// final class cant be extended
{
	/*final void display()//final method cant be overridden
	{
		System.out.println("This is a final method");
	}*/	
}


public class FinalDemo {

	public static void main(String[] args) {
		
final int AGE=20;
final float PI=3.142f;
//   AGE=30;   compilation error cuz final variable values cant be changed
	}}}


