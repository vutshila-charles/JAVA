package homeapp.SAMUELS_hLONGWANE_SEARCHING;
//HLONGWANE AND SAMUELS
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Display  extends JFrame {
	

	
	
		
		private JLabel studentNumberJLabel;
		private JLabel studentSurnameJLabel;
		private JLabel studentNameJLabel;
		private JLabel test1JLabel;
		private JLabel test2JLabel;
		

		private JTextField StudentNumberField;
		private JTextField StudentSurnameField;
		private JTextField StudentNameField;
		private JTextField Test1Field;
		private JTextField Test2Field;
		
		private JTextField AverageField;

		private JTextArea Screen;
		private JScrollPane Scroller;

		private JButton Show;
		private JButton Next;
		private JButton Back;
		private JButton Edit;

		private String sn, ss;
		private int stn, t1, t2, t3, t4, avg;

		private int searchPosition=0;

		private JPanel buttonsJPanel;

		private Employee[] myEmp=new  Employee[30];
		private int studentArrayCounter=0;
		private int next = 0;

	    public Display(Employee studentArray[],int count)
	    {
			super("DisplayDetailsGUI");
			setLayout(null);

			myEmp = studentArray;
			studentArrayCounter = count;

	//--------Instantiating and populating Labels---------------------------------------
			studentNameJLabel=new JLabel("Name :");
			studentNameJLabel.setBounds(10,10,100,20);
			add(studentNameJLabel);

			studentSurnameJLabel=new JLabel("Surname :");
			studentSurnameJLabel.setBounds(10,30,100,20);
			add(studentSurnameJLabel);

			studentNumberJLabel=new JLabel("Student No :");
			studentNumberJLabel.setBounds(10,50,100,20);
			add(studentNumberJLabel);

			test1JLabel=new JLabel("Test 1 :");
			test1JLabel.setBounds(10,70,100,20);
			add(test1JLabel);

			test2JLabel=new JLabel("Test 2 :");
			test2JLabel.setBounds(10,90,100,20);
			add(test2JLabel);

		

	//---------Instantiating and populating the TextFields-----------------------
			StudentNameField=new JTextField();
			StudentNameField.setBounds(120,10,200,20);
			add(StudentNameField);

			StudentSurnameField=new JTextField();
			StudentSurnameField.setBounds(120,30,200,20);
			StudentSurnameField.setEnabled(false);
			add(StudentSurnameField);

			StudentNumberField=new JTextField();
			StudentNumberField.setBounds(120,50,200,20);
			add(StudentNumberField);

			Test1Field=new JTextField();
			Test1Field.setBounds(120,70,200,20);
			add(Test1Field);

			Test2Field=new JTextField();
			Test2Field.setBounds(120,90,200,20);
			add(Test2Field);

			

			Next=new JButton("Next");
			Next.setBounds(10,180,100,20);
			Next.show();
			add(Next);

			Edit=new JButton("Edit");
			Edit.setBounds(10,190,120,20);
			Edit.hide();
			add(Edit);


			Back = new JButton("Back to Main");
			Back.setBounds(130,180,120,20);
			add(Back);

			StudentNameField.setText(""+myEmp[0].getEmpName());
			StudentSurnameField.setText(""+myEmp[0].getEmpSurname());
			StudentNumberField.setText(""+myEmp[0].getEmpNum());
			Test1Field.setText(""+myEmp[0].getEmpDept());
			Test2Field.setText(""+myEmp[0].getEmpRank());
			




	//----------Instantiating the Button Group----------------------------------------
			ButtonHandler myHandler=new ButtonHandler();
			Edit.addActionListener(myHandler);
			Next.addActionListener(myHandler);
			Back.addActionListener(myHandler);

	    }
	     private class ButtonHandler implements ActionListener
			{
			
				Employee ArrayOfRecords;
				public void actionPerformed(ActionEvent myEvent)
				{
				

					if(myEvent.getSource()==Show)
					{
				


					}
					else if(myEvent.getSource()==Next)
					{
				 
				
					try{

					next++;
					
					StudentNameField.setText(""+myEmp[next].getEmpName());
					StudentSurnameField.setText(""+myEmp[next].getEmpSurname());
					StudentNumberField.setText(""+myEmp[next].getEmpNum());
					Test1Field.setText(""+myEmp[next].getEmpDept());
					Test2Field.setText(""+myEmp[next].getEmpRank());

					}
					catch(NullPointerException n)
					{

					}

					}
					else if(myEvent.getSource()==Back)
					{
						dispose();
						Menu myGUI=new Menu(myEmp, studentArrayCounter);
	       				myGUI.setSize(270,350);
	        			myGUI.setVisible(true);
	        			myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						myGUI.setLocationRelativeTo(null);

					}

					else if(myEvent.getSource()==Edit)
					{
							try
					{
					String	empName = StudentNameField.getText();
					String empSurname = StudentSurnameField.getText();
					 String empDept = StudentNumberField.getText();
					 String empRank= Test1Field.getText();
					 int empNum = Integer.parseInt(Test2Field.getText());
					
					/* avg = Integer.parseInt(AverageField.getText());*/

					// This is a Vaidation to make sure Name starts with a Capital Letter
					if(!StudentNameField.getText().substring( 0, 1).matches("[A-Z]"))
					{
						JOptionPane.showMessageDialog(null,"Please ensure your Name starts with a Capital Letter.","Error",JOptionPane.ERROR_MESSAGE);
					}
					else if(!StudentSurnameField.getText().substring( 0, 1).matches("[A-Z]"))
					{
						JOptionPane.showMessageDialog(null,"Please ensure your Surname starts with a Capital Letter.","Error",JOptionPane.ERROR_MESSAGE);
					}

					// This is a Vaidation to make sure the Student number starts with 1/2 and is 9 digits long.
					else if(!StudentNumberField.getText().startsWith("1") && !StudentNumberField.getText().startsWith("2") || StudentNumberField.getText().length() < 9 || StudentNumberField.getText().length() > 9)
					{
							JOptionPane.showMessageDialog(null,"Please enter a Student number starting with 1/2 that is 9 digits long.","Error",JOptionPane.ERROR_MESSAGE);
					}
					//start of validating the tests
					else if(Integer.parseInt(Test1Field.getText())>100 || Integer.parseInt(Test1Field.getText())<0)
					{
						JOptionPane.showMessageDialog(null,"Please make sure that the mark is not greater than 100 and that it is not less than 0","Error",JOptionPane.ERROR_MESSAGE);
					}

					else if(Integer.parseInt(Test2Field.getText())>100 || Integer.parseInt(Test2Field.getText())<0)
					{
						JOptionPane.showMessageDialog(null,"Please make sure that the mark is not greater than 100 and that it is not less than 0","Error",JOptionPane.ERROR_MESSAGE);
					}

					

					// If all validations are SUCCESSFUL display Message to user.
					else
					{
						JOptionPane.showMessageDialog(null,"SUCCESSFUL","Info",JOptionPane.INFORMATION_MESSAGE);
						Employee myemployee = new Employee(empName,empSurname,empDept,empRank,empNum); //Got help with this from Mupfururirwa

						myEmp[searchPosition] = ArrayOfRecords;


					}
					}
					catch(NumberFormatException ex)
					{
					JOptionPane.showMessageDialog(null,"Please ensure all your details are correct","Error",JOptionPane.ERROR_MESSAGE);
					}
					newRecord();
					}
				}

			}

			public void search(int count)
			{
				StudentNumberField.setEditable(false);
				AverageField.setEditable(false);
				searchPosition=count;
			StudentNameField.setText(""+myEmp[count].getEmpName());
			StudentSurnameField.setText(""+myEmp[count].getEmpSurname());
			StudentNumberField.setText(""+myEmp[count].getEmpNum());
			Test1Field.setText(""+myEmp[count].getEmpDept());
			Test2Field.setText(""+myEmp[count].getEmpRank());
			
			Edit.show();
			Next.hide();




			}

			public void newRecord()
			{
				
			StudentNameField.setText(""+myEmp[searchPosition].getEmpName());
			StudentSurnameField.setText(""+myEmp[searchPosition].getEmpSurname());
			StudentNumberField.setText(""+myEmp[searchPosition].getEmpNum());
			Test1Field.setText(""+myEmp[searchPosition].getEmpDept());
			Test2Field.setText(""+myEmp[searchPosition].getEmpRank());
			}


	
	}
