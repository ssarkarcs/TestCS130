import java.text.DecimalFormat;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      double number = 123.12345890;
		      
		      DecimalFormat d= new DecimalFormat("0.##");

		      System.out.println(number);
		      
		      System.out.println(d.format(number));
		   }
		}
