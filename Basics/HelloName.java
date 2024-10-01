package in.co.Basics;

public class HelloName {
	
	public static void main(String[] args) {
//		System.out.println(args[0]);
	int size = args.length;
	if(size==0) {
		System.out.println("java Gv");
	}else {
		for (int i = 0; i < size; i++) {
			System.out.println(i+"=hello"+args[i]);
		}
	}
		
	}

	
}
