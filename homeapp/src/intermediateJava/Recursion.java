package intermediateJava;

public class Recursion {
//put the following line in main
	//System.out.println(fact(5));
	public static long fact(long n)
	{
		if(n <=1)
			return 1;
		else 
			return n* fact(n-1);
		
		
	}
	
}
