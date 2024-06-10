package in.co.Java8;

public class TestByAnnonymous {

	public static void main(String[] args) {

		TestFucntionalInterface h = new TestFucntionalInterface() {

			@Override
			public void Sayhello() {
				System.out.println("Functional Interface by annonymous Function");

			}
		};
		h.Sayhello();	

	}

}
