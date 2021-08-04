package oopsdemo2;

public class Student {
int rollNo;
String name;
Address ad;// Entity Reference-aggregation has-a relationship


public Student(int rollNo, String name, Address ad) {
	
	this.rollNo = rollNo;
	this.name = name;
	this.ad = ad;
}
void display()
{
	System.out.println("*******Student Details*******");
	System.out.println("Student Id  "+rollNo);
	System.out.println("Student name "+name);
	System.out.println("Address:" +ad.city+" "+ad.state+" "+ad.country+" "+ad.pincode);
}
	
	
	
	
}
