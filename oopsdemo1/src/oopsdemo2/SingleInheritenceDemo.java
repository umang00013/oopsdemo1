package oopsdemo2;

public class SingleInheritenceDemo {

	public static void main(String[] args) {
		Developer d1=new Developer(101,"James Gosling","JDBC");
		Developer d2=new Developer(105,"Rod Jhonson","Spring Framework");
		
		Accountant a1=new Accountant(201,"Gaurav Sharma","Process Salary of Employees","SAP");
		Accountant a2=new Accountant(201,"Mary John","Payment to Vendors","Tally");
		d1.display();
		d1.display1();
		
		d2.display();
		d2.display1();
		
		a1.display();
		a2.display();

	}

}
