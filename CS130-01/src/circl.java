
public class circl {
private int height;
private int width;

//getter
public int getHeight() {
	return height;
}
public int getWidht() {
	return width;
}
public void setHeight(int height) {
	this.height=height;
}
public void setWidth(int width) {
	this.width=width;
}
//area of rectangle
public int areaRec() {
	int area= height*width;
	return area;
}
public int periRec() {
	int peri= 2*(height+width);
	return peri;
}

	public static void main(String[] args) {
		circl obj=new circl();
		obj.setHeight(30);
		obj.setWidth(20);
		System.out.println("The area is"+obj.areaRec());
		System.out.println("The perimeter is"+obj.periRec());
	}	

}
