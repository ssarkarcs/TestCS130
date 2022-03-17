import java.util.Scanner;
import java.text.DecimalFormat;

public class decimal_format_circle {
	public static void main (String[] args)
	{
		
	int radius; 
	double area, circumference;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the radius:");
	radius = scan.nextInt();
	area= Math.PI* Math.pow(radius, 2);
	
	System.out.println(area);
	DecimalFormat fmt = new DecimalFormat("0.##"); // two decimal places
	
	System.out.println(fmt.format(area));
	
	circumference = 2* Math.PI*radius;
	System.out.println(fmt.format(circumference));
	
		
		
	}

}
