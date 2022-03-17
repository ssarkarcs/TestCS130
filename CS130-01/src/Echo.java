import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		
		String message; 
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter any string value: ");
		message=Scan.nextLine();
		
		System.out.println("The entered message is : " + message);

	}

}
