import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter grade");
		int grade = scan.nextInt();
		int category=grade/10;
		
		switch(category)
		{
		case 10:
			System.out.println("Grade A");
			break;
		case 9:
			System.out.println("Grade B");
			break;
		case 8:
			System.out.println("Grade C");
			break;
		case 7:
			System.out.println("Grade D");
			break;
		default:
			System.out.println("Not Passed");
			break;
		
		}

	}

}
