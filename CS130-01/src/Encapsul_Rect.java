
public class Encapsul_Rect {

	private int height;
	private int width;
	//Getter methods for height and width
	
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	
	//Setter for height and width
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	public int areaRec() {
		int area= height*width;
		return area;
	}
	public int periRect() {
		int perimeter=2*(height+width);
		return perimeter;
	}
	public static void main(String[] args) {
		Encapsul_Rect rectangle1= new Encapsul_Rect();
		rectangle1.setHeight(30);
		rectangle1.setWidth(20);
		System.out.println("Area of the rectangle: " +rectangle1.areaRec());
		System.out.println("The perimeter of the rectangle: "+rectangle1.periRect());

	}

}
