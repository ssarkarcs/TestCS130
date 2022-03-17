
public class WrapperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =56;
int a1=67;
Integer b = 67;
Integer b1 = 56;
Integer c = new Integer(20); //define int diffrently
System.out.println(c);
System.out.println(a+a1);
System.out.println(b.intValue()+b1.byteValue()); // int to byte
String s= b1.toString(); // int to string
System.out.println(s.length());
System.out.println(s+a1); //concatination
Float f = Float.parseFloat(s);  //string to float
System.out.println(f.floatValue()+a1);

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
