
public class methodoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   System.out.println(add(10,20, 2.33f));

	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static float add(int a,int b, float c)
	{
		return a+b+c;
	}

}
