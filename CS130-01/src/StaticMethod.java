
public class StaticMethod {
	public int getArea(int height, int width){
		 return height*width;
}
	public static int getArea1(int height1, int width1){
		 return height1*width1;
}
	public static void main(String[] args) {
		StaticMethod rect1= new StaticMethod();
		int area= rect1.getArea(20,30);
        System.out.println(area);
        System.out.println(StaticMethod.getArea1(23, 34));
	}
}

