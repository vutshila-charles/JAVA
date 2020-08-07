package intermediateJava;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> mylist = new ArrayList<>();
		mylist.add("John\n");
		mylist.add("Ben\n");
		mylist.add("Bonang\n");
		mylist.add("Abongwe\n");
		//mylist.remove(0);
		//System.out.println(mylist);
		//mylist.remove("Ben");
		/*Iterator<String> itr =  mylist.iterator();
		while(itr.hasNext())
		{
			System.out.print("Hi " +itr.next());
		}*/
		/*for(String i:mylist)
		{
			System.out.println("Hi " +i);
		}*/
		
		mylist.forEach(i->System.out.println("Hi "+i));
		
	}

}
