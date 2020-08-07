package assignments;
//HLONGWANE ad CHAVALALA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

import programming3.ReadFrom;

//port programming3.Sort;
 
public class MainMenu extends JFrame {
	
	//JButtons
	private JButton capture;
	private JButton display;
	private JButton read;
	private JButton write;
	private JButton sort;
	private JButton exit;
	
	//make a object for the class employee
	Employee[] emp = new Employee[10];
	int empCount=0;
	
	public MainMenu(Employee[] e, int count) {
		
		super ("MainGui");
		setLayout(null);
		emp = e;
		empCount =count;
		
		
		capture = new JButton("CAPTURE");
		capture.setBounds(50,50,200,30);
		add(capture);
		
		display = new JButton("DISPLAY");
		display.setBounds(50,90,200,30);
		add(display);
		
		read = new JButton("WRITE");//THE NAME OF THE BUTTN SHULD BE WRITE
		read.setBounds(50,130,200,30);
		add(read);
		
		write = new JButton("READ FILE");//THE NAME OF THE BUTTON SHOULD BE READ
		write.setBounds(50,170,200,30);
		add(write);
		
		
		sort = new JButton("SORT");
		sort.setBounds(50,210,200,30);
		add(sort);
		
		exit = new JButton("EXIT");
		exit.setBounds(50,250,200,30);
		add(exit);
		
		ButtonHandler handler = new ButtonHandler();
		capture.addActionListener(handler);
		display.addActionListener(handler);
		read.addActionListener(handler);
		write.addActionListener(handler);
		sort.addActionListener(handler);
		exit.addActionListener(handler);
		
	}

	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==capture)
			{
                dispose();
				
				CapRecords cap = new CapRecords(emp,empCount);
				cap.setSize(400,400);
				cap.setVisible(true);
				cap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			else if(event.getSource()==exit)
			{
				System.exit(0);
  
			}
			else if(event.getSource()==display)
			{
				try {
					
				
				DisRecords records = new DisRecords(emp,empCount);
				records.setSize(400,400);
				records.setVisible(true);
				records.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,"First capture your records");
				
					
				}
			}
			
			else if(event.getSource()==sort)
			{
                dispose();
				
                SortRecords		 cap = new SortRecords(emp,empCount);
				cap.setSize(400,400);
				cap.setVisible(true);
				cap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			else if(event.getSource()==read)
			{
				try {//try {
				
				Addrecords g = new Addrecords();
				g.Openfile();
				g.createAdd(emp, empCount);
				g.CloseFile();
				System.out.println("here is your records");
				JOptionPane.showMessageDialog(null,"Successfull");
				//}
				//catch(IOException exc)
				}//{
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,"First capture your records");
				
					
				}
			//}
			}
			
			else if(event.getSource()==write) {
				try
				{
					dispose();
					
					
				WriteFile mySaveFileGUI = new WriteFile();
				mySaveFileGUI.OpEnFile();
				mySaveFileGUI.readFile();
				mySaveFileGUI.closing();
				
				JOptionPane.showMessageDialog(null,"you have succesfully writen on your text file!!");
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null,"First capture your records");
				}
				
			}
		}
	}
}
	
	

