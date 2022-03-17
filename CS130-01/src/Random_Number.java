import java.util.Random;
public class Random_Number {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		int num1;
		float num2;
		num1=generator.nextInt(20)-10;
		num2=generator.nextFloat()*6;
		int num3=(int)num2;
	    System.out.println ("the integer number: " + num1);
	    System.out.println ("the float number: " + num2);
	    System.out.println ("the float number: " + num3);
	}

}
