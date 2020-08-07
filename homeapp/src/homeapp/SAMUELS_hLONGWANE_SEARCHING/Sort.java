package homeapp.SAMUELS_hLONGWANE_SEARCHING;
//HLONGWANE AND SAMUELS
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Sort extends JFrame {
	
	
	private JButton StudentNumber;
	private JButton Average;
	private JButton Surname;
	private JButton Back;
	
	Employee sortingArray[] = new Employee[30];
	int sortingArrayCounter = 0;
	Employee temp = new Employee();
	
	public Sort(Employee studentArray[], int count)
	{
		super("Sorting");
    	setLayout(null);
    	sortingArray = studentArray;
    	sortingArrayCounter = count;
    	
    	sortingArray = studentArray;
		sortingArrayCounter = count;		

		StudentNumber = new JButton("STUDENT #");
		StudentNumber.setBounds(30,30,120,20);
		add(StudentNumber);
		
		
			
		Surname = new JButton("SURNAME");
		Surname.setBounds(30,90,120,20);
		add(Surname);			

		Back = new JButton("BACK");
		Back.setBounds(30,120,120,20);
		add(Back);

		ButtonHandler myButtonHandler = new ButtonHandler();
		StudentNumber.addActionListener(myButtonHandler);

		Surname.addActionListener(myButtonHandler);
		Back.addActionListener(myButtonHandler);
    	
	}
	public class ButtonHandler implements ActionListener
	{
		
		public void actionPerformed(ActionEvent myEvent)
		{
	 if(myEvent.getSource() == StudentNumber)
		{
			//sorting
			for(int oc = 0; oc<sortingArrayCounter-1; oc++)
			{
				for(int ic = 0;ic<sortingArrayCounter-1;ic++)
				{
					//swaping
					if(sortingArray[ic].getEmpNum() > (sortingArray[ic+1].getEmpNum()))
					{
						temp = sortingArray[ic];
						sortingArray[ic] = sortingArray[ic+1];
						sortingArray[ic+1] = temp;
					}
					

				}//end of innerloop

			}//end outerloop
	       	JOptionPane.showMessageDialog(null,"Sorting has been done!");

		}
		
	 if(myEvent.getSource() == Surname)
		{
			//sorting
			for(int oc = 0; oc<sortingArrayCounter-1; oc++)
			{
				for(int ic = 0;ic<sortingArrayCounter-1;ic++)
				{
					//swaping
					if(sortingArray[ic].getEmpSurname().compareTo(sortingArray[ic+1].getEmpSurname())>0)
					{
						temp = sortingArray[ic];
						sortingArray[ic] = sortingArray[ic+1];
						sortingArray[ic+1] = temp;
					}
					

				}//end of innerloop

			}//end outerloop
	       	JOptionPane.showMessageDialog(null,"Sorting has been done!");

		}		
		else if(myEvent.getSource() == Back)
		{
				dispose();
				Menu myGUI = new Menu(sortingArray, sortingArrayCounter);
   				myGUI.setSize(350,300);
    			myGUI.setVisible(true);
    			myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				myGUI.setLocationRelativeTo(null);
		}

}
}
}
