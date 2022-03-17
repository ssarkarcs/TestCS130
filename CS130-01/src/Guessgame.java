import java.util.Random;
import java.util.Scanner;

public class Guessgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int Max = 10;
		int guess, answer;
		
		Scanner scan = new Scanner(System.in);
		
		Random generator = new Random();
		answer = generator.nextInt(Max)+1;
		
	while(true) {
		System.out.println("enter guess");
		guess=scan.nextInt();
		if (guess==answer)
		{
			System.out.println("Correct");
			break;
		}
		else if (guess>answer)
		{
			System.out.println("guess is more than answer, Try again");	
		}
		else
		{
			System.out.println("guess is less than answer, Try again");
		}
		
	}
	
	}
}
