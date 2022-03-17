
public class Autounboxwrapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//autobox convert primitive to wrapper object
	int value=20;
	Integer autoboxvalue=value;
	System.out.println(autoboxvalue);
	//unbox convert wrapper object to primitive one
	int value2=autoboxvalue;
	System.out.println(value2);

	char ch='a';
	Character ch1=ch;
	System.out.println(ch1);
	char ch2=ch1;
	System.out.println(ch2);
	
	
	}

}
