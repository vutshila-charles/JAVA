package programming3;
import java.util.*;

public class TheCreator {
	public static void main(String[] args)
	{
		final Formatter x;
		try {
			x = new Formatter("textfile.txt");
			System.out.println("You created a file");
		}
		catch(Exception e)
		{
			System.out.println("you got an error");
		}
	}

}
