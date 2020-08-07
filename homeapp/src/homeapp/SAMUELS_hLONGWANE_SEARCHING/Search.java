package homeapp.SAMUELS_hLONGWANE_SEARCHING;
//HLONGWANE AND SAMUELS
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.lang.NumberFormatException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Search extends JFrame {
	
	
	private JLabel searchStNumberJLabel;
	private JTextField searchJTextField;
	private JButton searchJButton;
	private JButton backJButton;
	
	Employee [] myEmp = new Employee [10];
	int count = 0;
	//int counter =0;
	
	public Search(Employee [] e,int c)
    {
		super("Search");
		setLayout(null);

		myEmp = e;
		count = c;

		searchStNumberJLabel=new JLabel("Student number :");
		searchStNumberJLabel.setBounds(10,10,100,20);
		add(searchStNumberJLabel);

		searchJTextField=new JTextField();
		searchJTextField.setBounds(120,10,100,20);
		add(searchJTextField);

		searchJButton=new JButton("Search");
		searchJButton.setBounds(10,40,120,20);
		add(searchJButton);

		backJButton=new JButton("Back to main");
		backJButton.setBounds(150,40,120,20);
		add(backJButton);

		ButtonHandler myHandler=new ButtonHandler();
		searchJButton.addActionListener(myHandler);
		backJButton.addActionListener(myHandler);


    }
    private class ButtonHandler implements ActionListener
		{

			public void actionPerformed(ActionEvent myEvent)
			{

				Employee ArrayOfRecords;
				if(myEvent.getSource()==searchJButton)
				{
					try
    				{
    				 int a = Integer.parseInt(searchJTextField.getText());
    				 for(int counter = 0;count <= count;counter++)
    				 {
    					if(myEmp[counter].getEmpNum()==a)
    					{
						//JOptionPane.showMessageDialog(null," "+" "+studentRecordArray[count].getStudentName());
						dispose();
							Display myDisplayGUI=new Display(myEmp,count);
							myDisplayGUI.setSize(400,260);
							myDisplayGUI.setVisible(true);
							myDisplayGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							myDisplayGUI.setLocationRelativeTo(null);
							//myDisplayGUI.Search(myEmp);
							myDisplayGUI.search(count);

    					}
    				 }
    				}
    				catch(Exception ex)
    				{


    				}


				}
				if(myEvent.getSource()==backJButton)
				{
					dispose();
					Menu myGUI=new Menu(myEmp,count);
					myGUI.setSize(350,300);
					myGUI.setVisible(true);
					myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					myGUI.setLocationRelativeTo(null);
				}

			}

		}


}
