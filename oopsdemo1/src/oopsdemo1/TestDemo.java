package oopsdemo1;

import oopsdemo3.Demo;
//public Access Specifier

public class TestDemo {

	public static void main(String[] args) {
Demo d1=new Demo();
		
		System.out.println("Public Variable of Demo class in another package: "+d1.a);
		d1.display();
	}

}
