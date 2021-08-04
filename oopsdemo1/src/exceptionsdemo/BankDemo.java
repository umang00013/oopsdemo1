package exceptionsdemo;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c1=new CheckingAccount(101);
		System.out.println("Depositing 3000...........");
			c1.deposit(5000);
			try {
				System.out.println("withdrswing 1000$");
				c1.withdraw(1000);
				System.out.println("withdrswing 1000$");
				c1.withdraw(2000);
			}
			
			catch(InsufficientFunds e)
			{
				System.out.println("sorry "+c1.getBalance());
				e.printStackTrace();
			}
			}

		

	}


