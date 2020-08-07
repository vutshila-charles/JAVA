package programming3;
import javax.swing.*;
import java.awt.*;

public class Validation {
	
	
Capture myCapture;
	
    public boolean Valid(String Number) // validation student number
    {
    	if(Number.length() == 9)
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The Vehicle number must start with 2 and must have 9 digits","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
    public boolean Valid_2(String Name) // validation student name 
    {
    	if(Name.substring(0,1).matches("[A-Z]"))
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The Car name must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
    
    public boolean valid_3(String Type)
    {
    	if(Type.substring(0,1).matches("[A-Z]"))
    	{
    		return true;
    	}
    	
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The Car name must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	
    }
    
   public boolean valid_4(String Region)
   {
	   if(Region.substring(0,1).matches("[A-Z]"))
	   {
		   return true;
	   }
	   else
	   {
		   JOptionPane.showMessageDialog(null,"The Car name must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
   		return false;
	   }
   }
   


}
