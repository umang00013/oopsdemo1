package oopsdemo1;

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1=new Complex(10.3,67.4);// invokes const
		Complex c2=new Complex(0.7,3.6);
		c1.add(c2);// calls ad() method by passing obj c2
		System.out.println(" the addn of 2 complex no is: ");
		
		c1.display();

	}

}
