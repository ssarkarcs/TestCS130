import java.util.Scanner;

public class IFDemoMinor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int MINOR=17;
Scanner scan = new Scanner(System.in);
System.out.print("Enter the age: ");
int input = scan.nextInt();

	if (input<=MINOR)
	{
		System.out.println("The person is Minor!!, Enjoy!!!");
		
	}

	
	else
	{
		System.out.println("Time to take responsibilities!");
	}
	System.out.println("Age is just a number");
}
}
