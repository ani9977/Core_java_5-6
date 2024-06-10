package in.co.thread;

public class Account {

	private double balance;

	public double getBalance() {

		delay();
		return balance;
	}

	public void setBalance(double Balance) {
		delay();
		this.balance = balance;

	}

	public void deposit(String msg, double amnt) {
		synchronized (this) {

			double bal = getBalance();
			bal = bal + amnt;
			setBalance(bal);

			System.out.println(msg + "new balance" + amnt);
		}
	}

	public void delay() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
