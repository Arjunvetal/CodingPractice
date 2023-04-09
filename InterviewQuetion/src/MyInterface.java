
public interface MyInterface {
	
	public default void defaultMethod() {
		System.out.println("interface default");
	}

	public static void MyStatic() {
		System.out.println("inside interface static ");
	}
}
