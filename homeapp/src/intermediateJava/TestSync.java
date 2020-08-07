package intermediateJava;

public class TestSync {

	public static void main(String[] args) {
		
		Multiply multiply = new Multiply();
		Runnable r5 =()->multiply.multiplies(5);
		Runnable r20 =()->multiply.multiplies(20);
		Thread t1 = new Thread(r5);
		Thread t2 = new Thread(r20);//allows you to run more than one function in a program 
		t1.start();
		t2.start();
		
	}
}
