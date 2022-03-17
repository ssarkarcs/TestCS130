import java.util.Random;
public class Random_Practice {

	public static void main(String[] args) {
		Random Generator = new Random();
		
		int out1;
		float out2;
		
		out1=Generator.nextInt();
		out2=Generator.nextFloat();
		
		int out3=(int)out2+1;
		int out4=Generator.nextInt(21);
		//Print the numbers starting from 10 and end at 30
		int out5=Generator.nextInt(21)+10;
		//Print the numbers starting from 15 and end at 17
		
		int out6=Generator.nextInt(2)+15   ;		
		
		System.out.println("The integer random number is:"+out1);
		System.out.println("The float random number is:"+out2);
		System.out.println("The int random number is:"+out3);
		System.out.println("The int random number of range of 0 to 20 is:"+out4);
		System.out.println("The int random number of range of 10 to 30 is:"+out5);
		System.out.println("The int random number of range of 15 to 17 is:"+out6);
	}

}
