package assignments;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Addrecords {
	Employee[] emp = new Employee[10];
	int empCount=0;
	int counter = 0;
	
	private Formatter x;
	
	
	public void Openfile()
	{
		try {
			x = new Formatter("filling.txt");
			
		}
		catch(Exception e)
		{
			System.out.println("you have an error");
		}
	}
public void createAdd(Employee[] ee,int count)
{
	emp = ee;
	empCount =count;
	
	
	Employee myemployee = new Employee();
	myemployee=emp[counter];
	counter++;
	x.format("%s\t\n",myemployee.getEmpName());
	x.format("%s\t\n",myemployee.getEmpSurname());
	x.format("%s\t\n",myemployee.getEmpDept());
	x.format(Integer.toString(myemployee.getEmpNum()));
	
	
}


public void CloseFile()
{
	x.close();
}
}
