package assignments;
import javax.swing.*;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

public class SortRecords extends JFrame {
	
	private JButton name;
	private JButton empnum;
	private JButton show;
	private JButton back;
	
	Employee[] emp = new Employee[10];
	int empCount;
	Employee temp = new Employee();
	
	
	public SortRecords(Employee[] e, int ec)
	{
		super("");
		setLayout(null);
		emp= e;
		empCount = ec;
		
		name = new JButton("Sort By name");
		name.setBounds(50,50,200,30);
		add(name);
		
		empnum = new JButton("Sort by EmpNum");
		empnum.setBounds(50,90,200,30);
		add(empnum);
		
		show = new JButton("Display");
		show.setBounds(50,130,200,30);
		add(show);
		
		back = new JButton("Back ");
		back.setBounds(50,170,200,30);
		add(back);
		Buttonhandler thehandler = new Buttonhandler();
		name.addActionListener(thehandler);
		empnum.addActionListener(thehandler);
		show.addActionListener(thehandler);
		back.addActionListener(thehandler);
		
		
	}

	private class Buttonhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==empnum)
			{
				
				
				for (int x=0; x<empCount-1; x++) 
				{ 
					for(int y=0; y<empCount-1; y++)
					{
						if(emp[y].getEmpNum() > (emp[y+1].getEmpNum()))
						{
							temp =emp[y];
							emp[y]= emp[y+1];
							emp[y+1] = temp;
						}
					}
					
					
					
				}
				JOptionPane.showMessageDialog(null,"Sorting has been done!");
				
			}
			else if(event.getSource()==name)
			{
				//sorting
				for(int oc = 0; oc<empCount-1; oc++)
				{
					for(int ic = 0;ic<empCount-1;ic++)
					{
						//swaping
						if(emp[ic].getEmpName().compareTo(emp[ic+1].getEmpName())>0)
						{
							temp = emp[ic];
							emp[ic] = emp[ic+1];
							emp[ic+1] = temp;
						}
						

					}//end of innerloop

				}//end outerloop
		       	JOptionPane.showMessageDialog(null,"Sorting has been done!");
			}
			else if(event.getSource()==show)
			{
				dispose();
				DisRecords mygui = new DisRecords(emp,empCount);
				mygui.setSize(400,400);
				mygui.setVisible(true);
				mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			else if(event.getSource()==back)
			{
				dispose();
				MainMenu mygui = new MainMenu(emp,empCount);
				mygui.setSize(400,400);
				mygui.setVisible(true);
				mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
	}
	
	
}
