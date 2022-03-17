
public class Array1 {

	public static void main(String[] args) {
String [] subjects= {"JAV", "Python01", "Python02"};
int [] items = {1,2,3,4,5,6};
System.out.println("The secoind element is:"+subjects[1]);
System.out.println("The array length: "+subjects.length);

//For each loop
for (int name:items)
{
	if (name%2==0)
	{
	System.out.println("Even numbers: "+name);
	}
	else
	{
		System.out.println("Odd numbers: "+name);
	}
}

}

}
