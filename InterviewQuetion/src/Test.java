
public class Test implements MyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test.MyStatic();
		
		MyInterface.MyStatic();
		new Test().defaultMethod();
	

	}
	
	public static void MyStatic() {
		System.out.println("inside Test class static ");
	}
}
