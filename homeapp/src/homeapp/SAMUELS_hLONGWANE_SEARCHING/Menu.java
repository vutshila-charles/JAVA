package homeapp.SAMUELS_hLONGWANE_SEARCHING;
//HLONGWANE AND SAMUELS
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
public class Menu extends JFrame {
	
	private JButton Capture;
	private JButton Display;
	private JButton Exit;
	private JButton Save;
	private JButton Read;
	private JButton Search;
	private JButton Sort;
	Employee [] myEmp = new Employee [10];
	int count = 0;
	
	public Menu(Employee [] e,int c)
	{
		super("Student Records");
		setLayout(null);

		myEmp = e;
		count = c;

//-------Instantiating and populating the Buttons--------------------

		Capture = new JButton("CAPTURE DETAILS");
		Capture.setBounds(60,20,150,30);
		add(Capture);

		Display = new JButton("DISPLAY DETAILS");
		Display.setBounds(60,60,150,30);
		add(Display);

		Save = new JButton("SAVE To FILE");
		Save.setBounds(60,100,150,30);
		add(Save);

		Read = new JButton("READ From FILE");
		Read.setBounds(60,140,150,30);
		add(Read);

		Search = new JButton("SEARCH");
		Search.setBounds(60,180,150,30);
		add(Search);

		Sort = new JButton("SORTING");
		Sort.setBounds(60,220,150,30);
		add(Sort);

		Exit = new JButton("EXIT");
		Exit.setBounds(60,260,150,30);
		add(Exit);

//----------Instantiating the Button Group----------------------------------------
		ButtonHandler myHandler=new ButtonHandler();
		Exit.addActionListener(myHandler);
		Capture.addActionListener(myHandler);
		Display.addActionListener(myHandler);
		Save.addActionListener(myHandler);
		Read.addActionListener(myHandler);
		Search.addActionListener(myHandler);
		Sort.addActionListener(myHandler);
	}
	
	private class ButtonHandler implements ActionListener
	{

		public void actionPerformed(ActionEvent myEvent)
		{
			if(myEvent.getSource() == Exit)
			{
			System.exit(0);
			}

			if(myEvent.getSource() == Sort)
			{
			dispose();
			Sort mySorting_Class = new Sort(myEmp, count);
	        mySorting_Class.setSize(350,230);
	        mySorting_Class.setVisible(true);
	        mySorting_Class.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mySorting_Class.setLocationRelativeTo(null);
			mySorting_Class.setResizable(false);
			}

			else if(myEvent.getSource() == Capture)
			{
				dispose();
			  	Capture myCaptureGUI = new Capture(myEmp,count);
				myCaptureGUI.setSize(400,260);
				myCaptureGUI.setVisible(true);
				myCaptureGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				myCaptureGUI.setLocationRelativeTo(null);
			}

			else if(myEvent.getSource() == Display)
			{
				try{

					
				Display myDisplayGUI = new Display(myEmp,count);
				myDisplayGUI.setSize(400,260);
				myDisplayGUI.setVisible(true);
				myDisplayGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				myDisplayGUI.setLocationRelativeTo(null);
				dispose();
				}
				catch(Exception ex)
			{
					
			JOptionPane.showMessageDialog(null,"Please ensure all your details are correct","Error",JOptionPane.ERROR_MESSAGE);
			}
			}

			else if(myEvent.getSource() == Save)
			{
				try
				{
				SaveFile mySaveFileGUI = new SaveFile(myEmp,count);
				mySaveFileGUI.setSize(400,260);
				mySaveFileGUI.setVisible(true);
				mySaveFileGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				mySaveFileGUI.setLocationRelativeTo(null);
				}
				catch(Exception ex){}
			}

			else if(myEvent.getSource() == Read)
			{
				try
				{
				ReadFile myReadFileGUI = new ReadFile();
				myReadFileGUI.setSize(400,450);
				myReadFileGUI.setVisible(true);
				myReadFileGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				myReadFileGUI.setLocationRelativeTo(null);
				System.out.println("here");
				}
				catch(IOException exc)
				{
				}
				
			}

			else if(myEvent.getSource() == Search)
			{
				dispose();
			  	Search mySearch = new Search(myEmp, count);
				mySearch.setSize(400,260);
				mySearch.setVisible(true);
				mySearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mySearch.setLocationRelativeTo(null);
			}


	}



}

	
	

}
