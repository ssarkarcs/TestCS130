import java.util.Scanner;
import java.text.NumberFormat;

public class FormatOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double tax_rate=.06;
		double subtotal, tax, totalCost;
		
		Scanner scan =new Scanner(System.in);
		
	System.out.print("Enter the subtotal");
    subtotal=scan.nextDouble();
    
    tax=subtotal*tax_rate;
    totalCost=subtotal+tax;
    System.out.println("Tax: " + tax);
    System.out.println("total cost: " + totalCost);
   
    NumberFormat fmt1= NumberFormat.getCurrencyInstance();
    
    NumberFormat fmt2= NumberFormat.getPercentInstance();
   
    
    System.out.println("Tax_Formatted: " + fmt1.format(tax));
    
    System.out.println(" Tax percentage formatted:  " + fmt2.format(tax_rate));
    System.out.println("The formatted total cost is:  "+ fmt1.format(totalCost));
    
    /*
    System.out.println("Tax_rate: " + fmt2.format(tax_rate));
    
    System.out.println("Tax " + fmt1.format(tax) + " at rate of " + fmt2.format(tax_rate) );
    
    System.out.println("totalCost_Formatted: " + fmt1.format(totalCost));
	*/
	}

}
