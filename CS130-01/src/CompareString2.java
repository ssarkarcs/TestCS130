
public class CompareString2 {

	public static void main(String[] args) {
		
//Here we will test .compareto method
		
		String Name1= "book";
		String Name2="bookcase";
		if (Name1.compareTo(Name2)>0)
		{
			System.out.println("Name1 is bigger");
		}
		else if (Name1.compareTo(Name2)==0)
		{
			System.out.println("Both the name same");
		}
		else
		{
			System.out.println("Name2 is bigger");
		}
		
	}

}
