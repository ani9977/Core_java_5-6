package in.co.thread;

public class TestAccountRacing {
	
	public static void main(String[] args) {
		
		AccountRacing r = new AccountRacing("ram");
		AccountRacing r1 = new AccountRacing("shyam");
		r.start();
		r1.start();
		
	}

}