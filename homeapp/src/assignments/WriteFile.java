package assignments;

import java.util.Formatter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;		//prints to text file
import java.io.FileWriter;		//creates a text file
import java.io.IOException;		//input/output exception
import javax.swing.JOptionPane;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WriteFile extends JFrame {
	

	
private Scanner x;
public void OpEnFile()
{
	try
	{
		x= new Scanner(new File("filling.txt"));
	}
	catch(Exception ex) {
		System.out.println("could not find file");
	}
	
}
	public void readFile()
	{
		while(x.hasNext())
		{
			
				
			String  a = x.next();
			
			
		
			System.out.printf("%s \n",a);
			
			
			
			
			
			
		}
	}
	
	public void closing()
	{
		x.close();  
	}
	



}