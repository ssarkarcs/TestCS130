
public class VarArgs {

	public static int summation(int... list)
	{
		int total =0;
		for (int i =0; i<list.length; i++) {
			total = total+list[i];
		}
		
		return total;
	}
	
	public static double multiplication(double... list1)
	{
		double total =1;
		for (int j =0; j<list1.length; j++) {
			total = total+list1[j];
		}
		
		return total;
	}	
	public static void main(String[] args) {
		System.out.println("The first sum: " +summation(1,2,3,4,5));
		System.out.println("The second sum: " +summation(1,2,3,4,5,7,11));
		System.out.println("The first multiplication: " +multiplication(1.22,2,3.46));
	}

}
