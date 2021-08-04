package exceptionsdemo;

public class CheckingAccount {

	
	private double balance;
	private int number;
	public CheckingAccount(int number) {
		super();
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public int getNumber() {
		return number;
	}
	public void deposit(double amount) {
        balance += amount;
     }
	
	public void withdraw(double amount) throws InsufficientFunds {
        if(amount <= balance) {
           balance -= amount;
        }else {
           double needs = amount - balance;
           throw new InsufficientFunds(needs);
        }
     }
}

