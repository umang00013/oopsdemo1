package oopsdemo2;
//  Multilevel Inheritence
public class Account { // base class for saving account
	int accNo;
	String name;
	public Account(int accNo, String name) {
		super();
		this.accNo = accNo;
		this.name = name;
	}
	void display()
	{
		System.out.println("********Account Details************");
		System.out.println("Account Number:"+accNo);
		System.out.println("Customer Name:"+name);
		
	}

}
