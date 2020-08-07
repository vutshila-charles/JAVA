package intermediateJava;
import java.awt.GridBagLayout;

import javax.swing.*;

public class FridayDemo extends JFrame {

	private JFrame frame;
	private JPanel panel;
	char div =247;
	char sqrt =8730;
	char  add= 43;
	char minus= 45;
	char multiply=42;
	char equal =61;
	
	JButton[] buttons = new JButton[16];
	String [] op = {"+","-","X","div","sqrt"};
	
   public FridayDemo()
   {
	  super("Friday");
	  
	  panel = new JPanel(new GridBagLayout());
	  System.out.println(div);
	  for(int i = 0;i<10;i++)
	  {
		 buttons[i] = new JButton(""+i);
		 
	  }
	  
	  for(int i = 0;i<6;i++)
	  {
		 buttons[i+10] = new JButton(op[i]);
		 
	  }
     
	 
	  
   }
   
}
