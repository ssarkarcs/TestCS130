import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner scan = new Scanner(System.in);
System.out.print("Enter any value: ");
i = scan.nextInt();

switch(i)
{
case 1:
	System.out.println("Case 1");
case 2:
	System.out.println("Case 2");
case 3:
	System.out.println("Case 3");
	break;
case 4:
	System.out.println("Case 4");
	break;
default:
	System.out.println("default");
	break;
}		
	}

}
