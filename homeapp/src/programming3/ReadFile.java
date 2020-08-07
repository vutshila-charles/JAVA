package programming3;
import java.io.*;
import java.util.*;

public class ReadFile {
	
private Scanner read;



public void openFile()
{
	try {
	read = new Scanner(new File("charr.txt"));
}
	catch(Exception e)
	{
		System.out.println("coul not find file");
	}
}


public void readfile()
{
	while(read.hasNext())
	{
		String a = read.next();
		String b = read.next();
		String c = read.next();
		System.out.printf("%s %s %s \n",a,b,c);
	}
}
public void closeFile()

{
	read.close();
}
}
