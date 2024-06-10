package in.co.Java8;

public class TestDefaultStatic {

	public static void main(String[] args) {

		DefaultStaticInterface ds = new DefaultStaticInterface() {

			@Override
			public void abstractmethod() {
				System.out.println("abstract method");

			}
		};
		ds.abstractmethod();
		ds.defaultMethod();
		DefaultStaticInterface.StaticMethod();

	}

}
