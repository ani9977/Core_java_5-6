package in.co.clonning;

public class Customer implements Cloneable {

	public String myName = null;

	public Account account = null;

	public Customer(String myName) {
		this.myName = myName;
		this.account = new Account(100);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (Account) account.clone();
		return c;
	}
}