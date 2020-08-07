package assignments;
import java.util.Formatter;

//HLONGWANE ad CHAVALALA
import javax.swing.*;

public class Main extends JFrame{
	public static void main(String[] args)
	{
		Employee[] emp = new Employee[10];
		int empCount = 0;
		
		MainMenu menu = new MainMenu( emp, empCount);
		menu.setSize(400,400);
		menu.setVisible(true);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
