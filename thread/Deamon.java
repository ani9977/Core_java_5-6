package in.co.thread;

public class Deamon extends Thread {

	public void run() {
		while (true) {
			try {
				Thread.sleep(300);
				System.out.println("deamon wokeup again");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("main");
		Deamon d = new Deamon();
		d.setDaemon(true);
		d.start();
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
