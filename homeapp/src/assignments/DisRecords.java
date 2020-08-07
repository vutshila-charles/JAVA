package assignments;

//HLONGWANE and CHAVALALA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//import assignments.CapRecords.Buttonhandler;

public class DisRecords extends JFrame {
	
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
		private JButton next;
		private JButton back;
		
		
		Employee[] emp = new Employee[10];
		int empCount=0;
		Employee myemployee = new Employee();
		int counter=0;
		
		
		public DisRecords(Employee[] e, int ec)
		{
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
			
			
			next = new JButton("Next");
			next.setBounds(10,130,140,30);
			add(next);
			
			back = new JButton("Back");
			back.setBounds(140,130,150,30);
			add(back);
			
			Buttonhandler thehandler = new Buttonhandler();
			next.addActionListener(thehandler);
			back.addActionListener(thehandler);
			
			Employee myemployee = new Employee();
			myemployee=emp[counter];
			name.setText(myemployee.getEmpName());
			sname.setText(myemployee.getEmpSurname());
			department.setText(myemployee.getEmpDept());
			number.setText(Integer.toString(myemployee.getEmpNum()));
			
			
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
				
				else if(event.getSource()==next)
				{
					try {
						
					
					counter++;
					myemployee=emp[counter];
					name.setText(myemployee.getEmpName());
					sname.setText(myemployee.getEmpSurname());
					department.setText(myemployee.getEmpDept());
					number.setText(Integer.toString(myemployee.getEmpNum()));
					}
					catch(NullPointerException exc){
						JOptionPane.showMessageDialog(null,"End","",JOptionPane.ERROR_MESSAGE);
						
					}
					
				}
			}
		}
		
		
		

}
