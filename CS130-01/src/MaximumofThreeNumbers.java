import java.util.Scanner;

public class MaximumofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1,number2,number3,max=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		number1=scan.nextInt();
		System.out.print("Enter the second number: ");
		number2=scan.nextInt();
		System.out.print("Enter the third number: ");
		number3=scan.nextInt();
		
		if(number1>number2)
		{
			if (number1>number3)
			{
				max=number1;
			}
			else
			{
				max=number3;
			}
		}
		else
		{
			if (number2>number3)
			{
				max=number2;
			}
			else
			{
				max=number3;
			}
		}
		System.out.println("The maximum number is" + max);

	}

}
