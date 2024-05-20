package in.co.exceptions;

public class Bank {

	double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double ammount) {

		balance += ammount;

	}

	public double withdraw(double ammount) throws BankException  {

		if (balance < 2000) {

			throw new BankException("Balance Can't be less then 2000");

		}
		if (ammount > balance) {

			throw new BankException("Insufficient Balance " + "Your withdraw ammount is more than balance");

		}

		balance -= ammount;

		return balance;
	}

}