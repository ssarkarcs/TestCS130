
public class WrapperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a= 30; // Its a primitive type
		int a1 = 40;
		Integer b =40; //Wrapper class
		Integer b1 =50;
		System.out.println("addition of primitive types : "+ (a+a1));
		System.out.println("addition of wrapper objects : " + (b.intValue()+b1.floatValue()));
//Convert an Integer value to String
		String s = b1.toString();
		System.out.println("Result 1 is : " + (b1+s));
	//Convert the string to float	
		Float f = Float.parseFloat(s);
		System.out.println("Result 2 is : " + (b+f));
		
		//Convert the string to integer
		
		Integer i =Integer.parseInt(s);
		System.out.println("Result 3 is : " + (b+i));
		
		//Autoboxing: Primitive to Wrapper object
		int number1=67;
		Integer conv1=number1;
		System.out.println("Primitive type" + number1);
		System.out.println("Autoboxed integer : " + conv1.doubleValue());
		
		//Unboxing: Wrapper object to Primitive type
		int number2=conv1;
		System.out.println("The unboxed int : " + number2);
	}

}
