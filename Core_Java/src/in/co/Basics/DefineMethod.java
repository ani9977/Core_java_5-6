package in.co.Basics;

public class DefineMethod {

	public static void main(String[] args) {
		
		printAll(args);
		
	}

	private static void printAll(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("hello" + args[i]);
		}
	}

	
}
