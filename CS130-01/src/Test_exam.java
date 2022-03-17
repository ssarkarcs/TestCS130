import java.util.Scanner;

public class Test_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height, width,length,area;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter height: ");
		height=scan.nextInt();
		System.out.println("Enter width: ");
		width=scan.nextInt();
		System.out.println("Enter length: ");
		length=scan.nextInt();
		
		area=height*width*length;
		System.out.println("The area value is: "+ area);
		
		

	}

}
