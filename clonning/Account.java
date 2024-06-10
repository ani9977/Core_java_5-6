package in.co.clonning;

public class Account implements Cloneable {

	public int balance = 0;

	public Account(int balance) {
		this.balance = balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
