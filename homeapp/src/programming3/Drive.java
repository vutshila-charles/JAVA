package programming3;
import javax.swing.*;

public class Drive {
	public static void main(String[] args)
	{
		/*Vehicle[] capVehicle = new Vehicle[3];
		int VehCount =0;
		MainGui mygui = new MainGui(capVehicle,VehCount);
		mygui.setSize(400,400);
		mygui.setVisible(true);
		mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
	    ReadFile r = new ReadFile();
	    r.openFile();
	    r.readfile();
	    r.closeFile();
	    
	
	}
}
