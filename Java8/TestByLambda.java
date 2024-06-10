 package in.co.Java8;

public class TestByLambda {

	public static void main(String[] args) {

		TestFucntionalInterface h = () -> {

			System.out.println("By Lambda Expression...!!!!");
		};
		h.Sayhello();
	}

}
