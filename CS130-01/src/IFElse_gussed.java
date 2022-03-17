import java.util.Random;
import java.util.Scanner;

public class IFElse_gussed {
	public static void main(String[] args) {
		
		int Max=10, answer,guess;
		
		Random Generator=new Random();
		answer = Generator.nextInt(Max)+1;
		
		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter the guess: ");
		
		guess= Scan.nextInt();
		
		if (guess==answer)
		{
			System.out.println("You got it, The guess is correct!!");
			
		}
		
		else
		{
			System.out.println("Try again");
	        System.out.println("The number was " + answer);


			
		}
		
	}

}
