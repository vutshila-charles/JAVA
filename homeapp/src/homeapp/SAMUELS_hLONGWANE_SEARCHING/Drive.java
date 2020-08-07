package homeapp.SAMUELS_hLONGWANE_SEARCHING;
//HLONGWANE AND SAMUELS 
import javax.swing.*;
public class Drive extends JFrame{
	public static void main (String[] args) 
	   
	{
		Employee [] myEmp = new Employee [10];
		int count = 0;

	Menu myGUI = new Menu(myEmp,count );
	myGUI.setSize(270,350);
	myGUI.setVisible(true);
	myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myGUI.setLocationRelativeTo(null);
}

}
