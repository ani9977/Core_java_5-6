package in.co.Inter;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {
	System.out.println("help to others");
	}

	@Override
	public void earnMoney() {
		System.out.println("earning Money");
		
	}

	@Override
	public void donation() {
		System.out.println("giving Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Doing Party");
		
	}
	public void New() {
		System.out.println("i am method of Businessman");
	}

}
