package in.co.thread;

public class WithThread extends Thread {

	String name;

	public WithThread(String name) {
		this.name = name;

	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + name);
		}
	}

	public static void main(String[] args) {

		WithThread t = new WithThread("Ram");
		WithThread t1 = new WithThread("shyam");

		t.start();
		t1.start();

		for (int i = 0; i < 20; i++) {
			System.out.println("main");
		}

	}
}
