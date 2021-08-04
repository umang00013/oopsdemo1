package oopsdemo3;
// program to demonstrate abstract classes

public class EmployeePay {

	public static void main(String[] args)
	{
		Manager mgrObj = new Manager("Henry", 5500.65, "Sydney", "Accounts");
	       double payTotal = mgrObj.totalPay();
	       double less = mgrObj.deduction(5);
	       double netPay = payTotal - less;
	       System.out.println("\nManager Details");
	       System.out.println("===================================");
	       mgrObj.show();
	       System.out.println("Total Pay: \t\t" + payTotal);
	       System.out.println("Net Pay: \t\t" + netPay);

	       Director dirObj = new Director("Stephen", 32400.00, "New York",
	       8000);
	       payTotal = dirObj.totalPay();
	       less = dirObj.deduction(5);
	       netPay = payTotal - less;
	       System.out.println("\n\nDirector Details");
	       System.out.println("============================");
	       dirObj.show();
	       System.out.println("Total Pay: \t\t" + payTotal);
	       System.out.println("Net Pay: \t\t" + netPay);
	       
	     //  Employee e1=new Employee();  compile error....cant instantiate abstract class employee
	   
	}}