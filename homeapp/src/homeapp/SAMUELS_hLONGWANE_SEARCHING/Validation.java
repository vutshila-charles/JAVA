package homeapp.SAMUELS_hLONGWANE_SEARCHING;

import javax.swing.JOptionPane;

public class Validation {
	
	
	Capture  mycapture;
	
    public boolean Valid(String  EmpNum) // validation employee number
    {
    	if( EmpNum.length() == 9)
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The Employee number must start with 2 and must have 9 digits","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
    public boolean Valid_2(String EmpName) // validation employee name 
    {
    	if(EmpName.substring(0,1).matches("[A-Z]"))
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The Employee name must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
    
    public boolean valid_3(String EmpSurname)
    {
    	if(EmpSurname.substring(0,1).matches("[A-Z]"))
    	{
    		return true;
    	}
    	
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The surname must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	
    }
    
   public boolean valid_4(String EmpDept)
   {
	   if(EmpDept.substring(0,1).matches("[A-Z]"))
	   {
		   return true;
	   }
	   else
	   {
		   JOptionPane.showMessageDialog(null,"The Department name must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
   		return false;
	   }
   }

}
