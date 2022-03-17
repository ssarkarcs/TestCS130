import java.util.Scanner;

public class nestedIFCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criteria of Navy selection : 
		//17-39 years old, and 97-271 lb weight
		//Take user input for age and weight		
		int age,weight;
		//User input for age and weight
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the age ");
		age = scan.nextInt();
		System.out.print("Enter the weight ");
		weight = scan.nextInt();
		//Condition check
		if (age>=17 && age<=39)
		{
			if (weight>96 && weight<272)
				
			{
				System.out.println("You are applicable for NAVY");
			}
			else
				
			{
				System.out.println("You are not applicable to NAVY. Check your weight please");
			}		
			
		}
		
		else
		{
			
			System.out.println("You are not applicable");	
		}
		

	}

}
