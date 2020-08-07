package homeapp.SAMUELS_hLONGWANE_SEARCHING;
//HLONGWANE AND SAMUELS
import javax.swing.JFrame;

import programming3.Validation;

import javax.swing.*;
import java.awt.event.*;
import java.lang.NumberFormatException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Capture extends JFrame{
	private JLabel empname;
	private JLabel empsurname;
	private JLabel emprank;
	private JLabel empdept;
	private JLabel empnum;
	
	private JTextField EmpNames;
	private JTextField EmpSNames;
	private JTextField EmpDepts;
	private JTextField EmpRanks;
	private JTextField EmpNums;
	private JButton Capture;
	private JButton Clear;
	private JButton Back;
	public String empN;
	public String SUrname;
	public String DEpart;
	public int NUmber;
	
	Employee [] myEmp = new Employee [10];
	int count = 0;
	int counter =0;
	public Capture(Employee [] e,int c) {
		
		super("Capture Details GUI");
		setLayout(null);
		
		myEmp = e;
		count = c;
		empname = new JLabel("Employee Name");
		empname.setBounds(10,10,150,20);
		add(empname);
		
		empsurname = new JLabel("Employee Surname");
		empsurname.setBounds(10,30,150,20);
		add(empsurname);
		
		emprank = new JLabel("Employee Rank");
		emprank.setBounds(10,50,150,20);
		add(emprank);
		
		empdept = new JLabel("Employee Department");
		empdept.setBounds(10,70,150,20);
		add(empdept);
		
		empnum = new JLabel("Employee Number");
		empnum.setBounds(10,90,150,20);
		add(empnum);
		
		EmpNames = new JTextField(15);
		EmpNames.setBounds(170,10,150,20);
		add(EmpNames);
		
		EmpSNames = new JTextField(15);
		EmpSNames.setBounds(170,30,150,20);
		add(EmpSNames);
		
		EmpDepts = new JTextField(15);
		EmpDepts.setBounds(170,50,150,20);
		add(EmpDepts);
		
		EmpRanks = new JTextField(15);
		EmpRanks.setBounds(170,70,150,20);
		add(EmpRanks);
		
		EmpNums = new JTextField(15);
		EmpNums.setBounds(170,90,150,20);
		add(EmpNums);
		
		Capture = new JButton("Capture");
		Capture.setBounds(10,180,110,20);
		add(Capture);

		Clear = new JButton("Clear");
		Clear.setBounds(130,180,100,20);
		add(Clear);

		Back = new JButton("Back to main");
		Back.setBounds(240,180,120,20);
		add(Back);
		
		ButtonHandler thehandler = new ButtonHandler();
		Capture.addActionListener(thehandler);
		Back.addActionListener(thehandler);
	}
	

	  private class ButtonHandler implements ActionListener
			{

				public void actionPerformed(ActionEvent myEvent)
				{

					 //Employee myemployee = new Employee();
					 
					if(myEvent.getSource() == Capture)
					{
							
					Validation validate = new Validation();
					String empName = EmpNames.getText();
					if(validate.Valid_2(empName))
					{
						empN=empName;
					}
					else
					{
						return;
					}
					
					 String empSurname = EmpSNames.getText();
					 if(validate.valid_3(empSurname))
						{
							SUrname=empSurname;
						}
						else
						{
							return;
						}
					String  empRank = EmpRanks.getText();
					 String empDept = EmpDepts.getText();
					 if(validate.valid_4(empDept))
						{
							DEpart=empDept;
						}
						else
						{
							return;
						}
					 String empNum = EmpNums.getText();
					 if(validate.Valid(empNum))
						{
							NUmber = Integer.parseInt(empNum);
						}
						else
						{
							return;
						}

					

					Employee myemployee = new Employee(empN,SUrname,empRank,DEpart,NUmber);
					
					myEmp[count]= myemployee;
					count++;

					JOptionPane.showMessageDialog(null,"You have successfully captured yourEmployee details");
					EmpNames.setText("");
					EmpSNames.setText("");
					EmpRanks.setText("");
					EmpDepts.setText("");
					EmpNums.setText("");

					

					}
					
					
					else if(myEvent.getSource()==Back)
					{
						dispose();
						Menu mygui = new Menu(myEmp,count);
						mygui.setSize(400,400);
						mygui.setVisible(true);
						mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				}
			}
}
