
import java.util.*;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10 random numbers in range 1 to 10

Random generator = new Random();
int random_number=generator.nextInt(10)+1;
//User guessed input
Scanner scan = new Scanner(System.in);
System.out.print("Enter any number between 1 to 10: ");
int guessed_input=scan.nextInt();

//condition check
if (guessed_input==random_number)
{
	System.out.println("Correct guess");
}
else if (guessed_input>random_number)
{
	System.out.println("Your input is more than the randomly generated number");
	System.out.println("The correct number is " + random_number);
}
else
{
	System.out.println("Your input is less than the randomly generated number");
	
	System.out.println("The correct number is " + random_number);
}

	}

}
