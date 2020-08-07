package programming3;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainGui extends JFrame{
	
	private JButton sort;
	private JButton search;
	private JButton display;
	private JButton capture;
	private JButton exit;
	Vehicle[] capVehicle = new Vehicle[3];
	int VehCount =0;
	
	public MainGui(Vehicle[] cap,int Count)
	{
		super ("MainGui");
		setLayout(null);
		
		capVehicle = cap;
		VehCount =Count;
		
		capture = new JButton("Capture");
		capture.setBounds(50,50,200,30);
		add(capture);
		
		sort = new JButton("SORT");
		sort.setBounds(50,90,200,30);
		add(sort);
		
		display = new JButton("DISPLAY");
		display.setBounds(50,130,200,30);
		add(display);
		
		search = new JButton("SEARCH");
		search.setBounds(50,170,200,30);
		add(search);
		
		exit = new JButton("EXIT");
		exit.setBounds(50,210,200,30);
		add(exit);
		
		
		Buttonhandler handler = new Buttonhandler();
		exit.addActionListener(handler);
		capture.addActionListener(handler);
		search.addActionListener(handler);
		display.addActionListener(handler);
		sort.addActionListener(handler);
	}

	private class Buttonhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==sort)
			{
                dispose();
				
				Sort search = new Sort(capVehicle,VehCount);
				search.setSize(400,400);
				search.setVisible(true);
				search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			else if(event.getSource()==display)
			{
			
				Display display = new Display(capVehicle,VehCount);
				display.setSize(400,400);
				display.setVisible(true);
				display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
			else if(event.getSource()==capture)
			{
			
				Capture myguii = new Capture(capVehicle,VehCount);
				myguii.setSize(400,400);
				myguii.setVisible(true);
				myguii.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
			else if(event.getSource()==search)
			{
				dispose();
				
				Sort search = new Sort(capVehicle,VehCount);
				search.setSize(400,400);
				search.setVisible(true);
				search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			else if(event.getSource()==exit)
			{
				System.exit(0);
  
			}
		}
		
	}
}
