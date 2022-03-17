
public class Array2 {

	public static void main(String[] args) {
// Create 15 array elements from 0 to 14
		
		int [] list = new int [11];
		
		//Created an array objects for 15 elements
		System.out.println("We are checking even and odd numbers for a range 0 to 10");
		for (int i=0; i<11; i++) {
			//Multiply 10 with each of the elements
		
			if (i%2==0)
			{
				list[i]=i;
			System.out.println("Even Value : " +list[i]);
			}
			else {
				list[i]=i;
				System.out.println("Odd Value : " +list[i]);
			}
		}

	}

}
