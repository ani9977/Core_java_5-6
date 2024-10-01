package in.co.clonning;

public class Account implements Cloneable {

	public int balance = 0;
    int a=balance;
	public Account(int balance) {
		this.a = a;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
