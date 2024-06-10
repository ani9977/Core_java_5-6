package in.co.Java8;

public interface DefaultStaticInterface {
	
	
	public void abstractmethod();
	
	public default void defaultMethod() {
		System.out.println("Default Method");
	}
	
	public static void StaticMethod() {
		System.out.println("Static Method");
	}

}
