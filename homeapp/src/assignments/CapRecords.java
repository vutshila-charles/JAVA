package assignments;
import java.awt.HeadlessException;
//HLONGWANE and CHAVALALA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import programming3.Validation;

//import programming3.MainGui;


public class CapRecords extends JFrame {
	//Labels
	private JLabel Name;
	private JLabel Surname;
	private JLabel Department;
	private JLabel Number;
	
	//TextFields
	private JTextField name;
	private JTextField sname;
	private JTextField department;
	private JTextField number;
	
	//control buttons
	private JButton capture;
	private JButton back;
	
	
	Employee[] emp = new Employee[10];
	int empCount;
	public String empN;
	public String SUrname;
	public String DEpart;
	public int NUmber;
	
	
	public CapRecords(Employee[] e, int ec) {
		super();
		setLayout(null);
		emp = e;
		empCount=ec;
		
		
		Name = new JLabel("Employee Name");
		Name.setBounds(10,10,200,30);
		add(Name);
		
		Surname = new JLabel("Employee Surname");
		Surname.setBounds(10,40,200,30);
		add(Surname);
		
		Department = new JLabel("Department");
		Department.setBounds(10,70,200,30);
		add(Department);
		
		Number = new JLabel("Employee Number");
		Number.setBounds(10,100,200,30);
		add(Number);
		
		
		name = new JTextField(10);
		name.setBounds(140,10,150,20);
		add(name);
		
		sname = new JTextField(10);
		sname.setBounds(140,40,150,20);
		add(sname);
		
		department = new JTextField(10);
		department.setBounds(140,70,150,20);
		add(department);
		
		number = new JTextField(10);
		number.setBounds(140,100,150,20);
		add(number);
		
		
		capture = new JButton("Capture");
		capture.setBounds(10,130,140,30);
		add(capture);
		
		back = new JButton("Back");
		back.setBounds(140,130,150,30);
		add(back);
		
		Buttonhandler thehandler = new Buttonhandler();
		capture.addActionListener(thehandler);
		back.addActionListener(thehandler);
		
		
	}
	
	private class Buttonhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==back)
			{
				dispose();
				MainMenu mygui = new MainMenu(emp,empCount);
				mygui.setSize(400,400);
				mygui.setVisible(true);
				mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
			else if(event.getSource()==capture)
			{
				Validation validate = new Validation();
				
				String empName = name.getText();
				if(validate.Valid_2(empName))
				{
					empN=empName;
				}
				else
				{
					return;
				}
				
				String empSurname = sname.getText();
				if(validate.valid_3(empSurname))
				{
					SUrname=empName;
				}
				else
				{
					return;
				}
				String empDept = department.getText();
				if(validate.valid_4(empDept))
				{
					DEpart=empDept;
				}
				else
				{
					return;
				}
				String empNum = number.getText();
				if(validate.Valid(empNum))
				{
					NUmber = Integer.parseInt(empNum);
				}
				else
				{
					return;
				}
				
				Employee myemployee = new Employee(empN,SUrname,DEpart,NUmber);
				emp[empCount]= myemployee;
				empCount++;
				
				name.setText("");
				sname.setText("");
				department.setText("");
				number.setText("");
				JOptionPane.showMessageDialog(null,"You have successfully captured yourEmployee details");
				
			}
		}
	}
	
	
	

}
