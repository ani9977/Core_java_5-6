package in.co.Encapsulation;

public class Account {
	private int number;
	private String account;
	private double balance;

	public Account(int number, String account, double balance) {
		this.number = number;
		this.account = account;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	// Setter method for number
//	public void setNumber(int number) {
//		this.number = number;
//	}

	// Getter method for account
	public String getAccount() {
		return account;
	}

	// Setter method for account
//	public void setAccount(String account) {
//		this.account = account;
//	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. New balance: " + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
		}
	}

	public static void main(String[] args) {

		Account account = new Account(123456, "Savings", 1000.0);

		System.out.println("Account Number: " + account.getNumber());
		System.out.println("Account Type: " + account.getAccount());
		System.out.println("Balance: " + account.getBalance());

		account.deposit(15000.0);

//		account.withdraw(200.0);
	}
}
