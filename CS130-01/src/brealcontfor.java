
public class brealcontfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
/*			
float a= 2.99f;
float b = 2.99f;
if (Math.abs(a-b)<0.00001)
{
	System.out.println("Two numbers are essentially equal");
}
else
	System.out.println("The numbers are not equal");
	
*/
		String name1="Anisha";
		String name2= "Anishy";
		/*if (name1.equals(name2))
		{
			System.out.println("Both names are equal");
		}
		else
		{
			System.out.println("names are not equal");
		}*/
		if (name1.compareTo(name2)<0)
		{
			System.out.println("name1 comes first");
		}
		else if (name1.compareTo(name2)==0)
		{
			System.out.println("both equal");
		}
		else 
		
			{
				System.out.println("name2 comes first");
			}
		
	}		
}
