package in.co.thread;

public class AccountRacing extends Thread {

	static Account data = new Account();

	public AccountRacing(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i <= 4; i++) {
			data.deposit(getName(), 1000);
		}
	}

}
