package intermediateJava;

public class Multiply {
	
	
	synchronized void multiplies(int n) {
		for(int i =1 ;i<=5;i++) {
			
			System.out.println(i*n);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}

}
