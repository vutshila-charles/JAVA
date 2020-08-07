package programming3;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sort extends JFrame {
	
	private JButton stunameJButton;
	private JButton studnumJButton;
	/*private JButton studmarksJButton;*/
	private JButton backtomainJButton;
	
	
	Vehicle[] mysortbyClassGui = new Vehicle[10];
	int mysortClassSize = 0;
	int inner,inner1 ;
	int outer,outer1 ;
	Vehicle temp = new Vehicle();
	Vehicle tempo = new Vehicle();
	Vehicle temp2 = new Vehicle();
	
	
	

    public Sort(Vehicle[] sm, int sv) 
    {
    	super ("SORT BY GUI");
    	setLayout(null);
    	
    	mysortbyClassGui = sm;
    	mysortClassSize	= sv;
    	
    	stunameJButton = new  JButton("CAR NAME ");
    	stunameJButton.setBounds(50,50,200,30);
       	add(stunameJButton);

    	studnumJButton = new  JButton("REG NUMBER ");
    	studnumJButton.setBounds(50,90,200,30);
       	add(studnumJButton);

       /*	studmarksJButton = new JButton("REGION");
    	studmarksJButton.setBounds(50,120,200,30);
        add(studmarksJButton);*/
        
        
    	backtomainJButton = new  JButton("BACK TO MAIN");
    	backtomainJButton.setBounds(50,160,200,30);
        add(backtomainJButton);
        
        
        ButtonHandler myButtonHandler = new ButtonHandler();         
		studnumJButton.addActionListener(myButtonHandler);
		stunameJButton.addActionListener(myButtonHandler);
		/*studmarksJButton.addActionListener(myButtonHandler);*/
		backtomainJButton.addActionListener(myButtonHandler);

    	
    }//END OF SORT BY CONSTRUCTOR
    
    
    private class ButtonHandler implements ActionListener
    {
    	 public void actionPerformed(ActionEvent myEvent)
    	 {
//--------------------------- sort by car number ---------------------------------------------------------------------   	 		
    	 		if (myEvent.getSource() == studnumJButton)
    	 		{
    	 				for( int outer = 0; outer < mysortClassSize-1; outer++)
    			{
    				for( int inner = 0; inner < mysortClassSize-1; inner++)
    				{
    					if((mysortbyClassGui[inner+1].getNumber ())==(mysortbyClassGui[inner ].getNumber ()))
    					{
    						temp = mysortbyClassGui[inner];
    						mysortbyClassGui[inner] = mysortbyClassGui[inner + 1];
    						mysortbyClassGui[inner + 1] = temp;

    						JOptionPane.showMessageDialog(null,"You have successfully sort by student name");
    					}
    				}
    			}
    	 		}
//--------------------------- sort by student final marks ---------------------------------------------------------------------    	 		
    	 		
    	 		/*else if (myEvent.getSource() == studmarksJButton)
    	 			
    	 		{	
    	 			
    	 				for( int outer1 = 0; outer1 < mysortClassSize-1; outer1++)
    	 			{
    	 		
    	 			
    	 				for( int inner1 = 0; inner1 < mysortClassSize-1; inner1++)
    				{
    					if((mysortbyClassGui[inner1+1].getName())<(mysortbyClassGui[inner1].getName()))
    					{
    						tempo = mysortbyClassGui[inner1];
    						mysortbyClassGui[inner1] = mysortbyClassGui[inner1 + 1];
    						mysortbyClassGui[inner1 + 1] = tempo;

    						JOptionPane.showMessageDialog(null,"You have successfully sort by final marks");
    					}
    				}
    				}
    			}*/
//--------------------------------------sort by Vehicle Type-----------------------------------------------------------------------    			
    			else if (myEvent.getSource() == stunameJButton)
    			{
    				for(int outer2 = 0; outer <mysortClassSize-1 ;outer2++)
    				{
    					for (int inner2 = outer2+1 ; inner2<mysortClassSize;inner2++)
    					{
    						if((mysortbyClassGui[outer2].getType()).compareTo(mysortbyClassGui[inner2].getType())>0)
    						{
    							temp2 =mysortbyClassGui[outer2];
    							mysortbyClassGui[outer2]=mysortbyClassGui[inner2];
    							mysortbyClassGui[inner2] = temp2;
    							
    						JOptionPane.showMessageDialog(null,"You have successfully sort by Vehicle Type");
    						}
    						
    					}
    				}
    			}
//--------------------------- back to main GUI button ---------------------------------------------------------------------    	 		
    	 		
    	 		else if (myEvent.getSource() ==backtomainJButton)
    	 		{		
    	 			dispose();
    	 			MainGui myMenu = new MainGui(mysortbyClassGui,mysortClassSize); // calling the Main class
			    	myMenu.setSize(300,300);//size of the GUI
			    	myMenu.setVisible(true);// visibility of the GUI
			    	myMenu.setResizable(false);// GUI not resizable
			    	myMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit
			    	myMenu.setLocationRelativeTo(null);// centered the GUi
    	 		}
    	 }
    }
    
    
}// end of sort by jframe


