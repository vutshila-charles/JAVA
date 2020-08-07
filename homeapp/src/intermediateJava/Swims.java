package intermediateJava;

public interface Swims {
	
	public void Dive();
	default public void swim()
	{
		System.out.println("Uses his own power ");
	}
	
		


}
