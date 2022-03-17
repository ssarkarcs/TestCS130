import java.text.NumberFormat;
import java.util.Scanner;

public class IFElse_Wages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double rates =8.25;
int Standard_hour=40;
double pay;
Scanner scan =new Scanner(System.in);
System.out.println("Enter number of hours: ");
int Working_hours=scan.nextInt();
NumberFormat fmt=NumberFormat.getCurrencyInstance();
if (Working_hours>Standard_hour)
{
	pay=(Working_hours-Standard_hour)*(rates*1.5)+Standard_hour*rates;

}
else
{
	pay = Working_hours*rates;
	
	}
System.out.println("The worker pay is: "+fmt.format(pay));
	}

}
