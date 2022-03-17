import java.util.Scanner;

public class CalculateWedges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double regular_rate=8.25;
   int standard_hour=40;
   double pay;
   
   Scanner scan =new Scanner(System.in);
   System.out.println("Enter the number of hours you worked: ");
   
   int hours=scan.nextInt();
   
   if (hours>standard_hour)
   {
	 pay=(hours-standard_hour)*(regular_rate*1.5)
			 + standard_hour*regular_rate;
   }
   
   else
   {
	pay= hours* regular_rate;
   }
   System.out.println("The person get paid: " +pay);
	}

}
