package intermediateJava;
//converting array to list
import java.util.*;
public class Converting {
	
	public void convert()
	{
		String[] stuff = {"John","Methew","Exodus","Psalm"};
		//change array to a list
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		thelist.add("pump");
		thelist.addFirst("firstThing");
		//convert back to an array
		stuff = thelist.toArray(new String[thelist.size()]);
		
		for(String x: stuff)
			System.out.printf("%s", x);
	}

}
