package intermediateJava;
import java.util.*;

public class Collections {
	
	public void collect() {
	String[] things = {"Car","Lasers","Hats","Tacos"};
	List<String> list1 = new ArrayList<String>();
	
	for(String x: things)
		list1.add(x);
	
	String[] morethings = {"Lasers","Hats"};
	List<String> list2 = new ArrayList<String>();
	
	for(String y:morethings)
		list2.add(y);
	for(int i =0; i<list1.size();i++)
	{
		System.out.printf("%s", list1.get(i));
	}
	//arraylist
	editlist(list1,list2);
	System.out.println();


} 
	public static void editlist(Collection<String> l1,Collection<String> l2)
	{
		Iterator<String> it = l1.iterator();//goes item by item
		while(it.hasNext())
		{
			if(l2.contains(it.hasNext()))
				it.remove();
		}
		
	}
}