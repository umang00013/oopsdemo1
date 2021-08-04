package oopsdemo1;

import java.util.Scanner;

class Area
{
	int length,breadth;
	
	public void input_data(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public int return_area()
	{
		return (length*breadth);
	}
}

public class RectArea {

	public static void main(String[] args) {
		int l,b,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length ");
		l=sc.nextInt();
		System.out.println("Enter Breadth ");
		b=sc.nextInt();
		Area ar=new Area();
		ar.input_data(l, b);
		r=ar.return_area();
		System.out.println("Area is " + r);

	}

}
