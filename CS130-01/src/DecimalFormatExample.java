
import java.text.DecimalFormat;
import java.util.Scanner;
public class DecimalFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius;
	
		
		
		Scanner Scan = new Scanner(System.in);
		System.out.println(" Enter the radius : ");
		radius= Scan.nextDouble();
		
		//area= pi*(r*r)
		double area = Math.PI* Math.pow(radius,2);
		//circumference= 2*pi*r
		double circumference = 2* Math.PI * radius;
		//It will print decimal values based on the hash count
		 DecimalFormat fmt = new DecimalFormat("0.###"); 
		 System.out.println("The area of circle: " +fmt.format(area));
		 System.out.println("The circumference of circle: " +fmt.format(circumference));

	}

}
