
public class varArgs2 {

	public static void display(String str, int... number) {
		
		 System.out.println("String: " + str);
		for (int i = 0; i<number.length; i++) {
			System.out.println("Numbers :" + number[i]);
		
		}
	}
		public static void main(String args[])
	    {     
			display("Hello", 100, 200);
			display("Class", 1, 2, 3, 4, 5);
			display("Wake Up");
	    }
		
	}

