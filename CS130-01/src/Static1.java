
public class Static1 {
	String name;
	int age;
	//String major ="Computer Science";
	
	//memory space allocated at the class
	static String major ="Computer Science";
	public static void main(String[] args)
	{
		
		//allocate memory for name, age, and major but its wastage as major is same.
	Static1 s1= new Static1();
	s1.name="Sam";
	Static1 s2= new Static1();
	s2.name="Harry";
//System.out.println(s2.major);
	System.out.println(Static1.major);
	}
	

}
