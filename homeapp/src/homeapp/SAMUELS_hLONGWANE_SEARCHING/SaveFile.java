package homeapp.SAMUELS_hLONGWANE_SEARCHING;
//HLONGWANE AND SAMUELS
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;		//prints to text file
import java.io.FileWriter;		//creates a text file
import java.io.IOException;		//input/output exception
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class SaveFile extends JFrame {
	private int sn;
	private String ss;
	private int cn;
	private String se;

	private JLabel fileNameJLabel;
	private JTextField fileNameJTextField;
	private JButton saveJButton;
	private JButton backtomainJButton;
	
	Employee [] myEmp = new Employee [10];
	int count = 0;
	public SaveFile(Employee [] e,int c) {
		
		super("Save File GUI");
		setLayout(null);
		myEmp = e;
		count = c;
		
		fileNameJLabel = new JLabel("File Name:");
		fileNameJLabel.setBounds( 10, 10, 100, 20);
		add(fileNameJLabel);

		fileNameJTextField = new JTextField();
		fileNameJTextField.setBounds( 80, 10, 200, 20);
		add(fileNameJTextField);

		saveJButton = new JButton("Save");
		saveJButton.setBounds( 10, 40, 70, 20);
		add(saveJButton);

		backtomainJButton = new JButton("Back to Main");
		backtomainJButton.setBounds( 10, 70, 120, 20);
		add(backtomainJButton);

		ButtonHandler myHandler = new ButtonHandler();
		saveJButton.addActionListener(myHandler);
		backtomainJButton.addActionListener(myHandler);
	}


	public void SaveFileText()
	{
    	try
		{
		PrintWriter outFile1 = new PrintWriter(new FileWriter(fileNameJTextField.getText()+".txt"));

		for(int counter = 0;counter <= count;)
		{
		outFile1.println(myEmp[counter]);// writte info on one line, then goes to the second line, until it reaches the array limit.
		counter++;
		}
		outFile1.close();//close file
		}
		catch(IOException exc)
		{
		System.out.println(exc);
		}
	}

	 private class ButtonHandler implements ActionListener
	{
	public void actionPerformed(ActionEvent myEvent)
	{
		if(myEvent.getSource() == saveJButton)
		{
				SaveFileText();
				dispose();
		 }

		if(myEvent.getSource() == backtomainJButton)
		{

			Menu myGUI=new Menu(myEmp,count);
   			myGUI.setSize(270,350);
    		myGUI.setVisible(true);
    		myGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			myGUI.setLocationRelativeTo(null);
			dispose();

		}
	 }
	}
	

}
