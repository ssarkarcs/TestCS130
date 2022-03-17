import java.util.Scanner;

public class IFElifLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//User input on marks
		int marks;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		marks=scan.nextInt();	
		//Condition check
		
		if (marks<=60)
		{
			System.out.println("Fail");
		}
		else if (marks>=60 && marks<70)
		{
			System.out.println("The grade is: D");
		}
		else if (marks>=70 && marks<80)
		{ 
			System.out.println("The grade is: c");
		}
		else if (marks>=80 && marks<90)
		{
			System.out.println("The grade is: B");	
		}
		else if (marks>=90)
		{
			System.out.println("The grade is: A");
		}
		else
		{ 
			System.out.println("Invalid!!!");
		}
		
	}

}
