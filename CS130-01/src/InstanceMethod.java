
public class InstanceMethod {
	public int RectArea(int height, int width) {
		return height*width;
	}
	
	public static int RectArea1(int height, int width) {
		return height*width;
	}
	

	public static void main(String[] args) {
	InstanceMethod rect1 =new InstanceMethod();
	System.out.println("the are is: " +rect1.RectArea(20,30));
	
	System.out.println("The area using static method"+ InstanceMethod.RectArea1(10,20));

	}

}
