package intermediateJava;
import javax.swing.*;

public class ClientTest {
	public static void main(String[] args)
	{
		Client charlie ;
		charlie = new Client("0.0.0.0");
		
		charlie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		charlie.startRunning();
		
	}

}
 