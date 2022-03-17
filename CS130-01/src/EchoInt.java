import java.util.Scanner;
public class EchoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value1,value2;
		int result;
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		value1 =Scan.nextInt();
		
		System.out.println("Enter the second number: ");
		
		value2=Scan.nextInt();
		
		result=value1+value2;
		System.out.println("The result is : " + result);
	}

}
