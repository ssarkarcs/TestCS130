
import java.util.*;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList<String>New_name= new ArrayList<String>();
		New_name.add("Johny");
		New_name.add("Nick");
		New_name.add("Eric");
		New_name.add("Cleetus");
		New_name.add("Alise");
		New_name.add("Ashley");
		Iterator<String> Iter=New_name.iterator();
		
		//System.out.println("Printing the first item of the arraylist: "+Iter.next());
		//Print all the elements of the array list using hasNext()
		while(Iter.hasNext())
		{
			
			String name=Iter.next();
			if (name=="Cleetus")
				
				Iter.remove();	
		}
			
	
	System.out.println("Printing the first item of the arraylist: "+New_name);
	

}
}
