import java.util.Scanner;
public class Milage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int miles;
double gallon, mpg;

Scanner scan = new Scanner(System.in);
 System.out.print("Enter the miles : ");
 
 miles= scan.nextInt();
 
 System.out.print("Enter the gallon : ");
 
 gallon = scan.nextDouble();
 
 mpg=miles/gallon;
 
 System.out.print("The mpg is : " +mpg);

	}

}
