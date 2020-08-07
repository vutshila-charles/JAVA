package intermediateJava;


class MyStatic{
	static {
		System.out.println("This is a static block for class TestStatic");
		
	}
}

public class TestStatic {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		Class.forName("intermediateJava.MyStatic");//can load any class without creating the instance of a class
		

	}

}
