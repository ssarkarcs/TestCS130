import java.util.ArrayList;
import java.util.Iterator;

public class arrayLiatint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				ArrayList<Integer>Number= new ArrayList<Integer>();
				Number.add(10);
				Number.add(20);
				Number.add(8);
				Number.add(45);
				Number.add(25);
				Number.add(12);
				Iterator<Integer> Iter=Number.iterator();
				
				//System.out.println("Printing the first item of the arraylist: "+Iter.next());
				//Print all the elements of the array list using hasNext()
				while(Iter.hasNext())
				{
					
					Integer newNumber=Iter.next();
					if (newNumber<10 || newNumber>20)
						
						Iter.remove();	
					
				}
					
			System.out.println("Printing the first item of the arraylist: "+Number);
			

		}
		}


