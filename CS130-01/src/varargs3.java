
public class varargs3 {

	public static void display(String str, int...numbers)
	{
		System.out.println("The string elements: " +str);
		
		for (int i = 0; i<numbers.length;i++) {
			System.out.println("Numbers are: "+ numbers[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		display("Hello",10, 20, 34);
		display("Class", 34,56);
	
	}

}
