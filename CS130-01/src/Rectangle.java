
public class Rectangle {
	
	int height;
	int width;
	String color;
	
	public Rectangle(int height, int width, String color)
	{
		this.height=height;
		this.width=width;
		this.color=color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle firstRectangle=new Rectangle(30,40,"Yellow");
		Rectangle secondRectangle=new Rectangle(100,50,"White");
		System.out.println("width of the first rectangle: "+firstRectangle.width);
		System.out.println("color of the first rectangle: "+secondRectangle.color);
	/*	
		Rectangle firstRectangle=new Rectangle();  //Created an instance of the rectangle class
		firstRectangle.height=30;
		firstRectangle.width=40;
		firstRectangle.color="Yellow";
		System.out.println("width of the first rectangle: "+firstRectangle.width);
		System.out.println("Area of the first rectangle: "+ firstRectangle.width*firstRectangle.height);
		
		Rectangle secondRectangle=new Rectangle();
		secondRectangle.height=100;
		secondRectangle.width=50;
		secondRectangle.color="White";
		System.out.println("Perimeter of the second rectangle: "+ 2*(secondRectangle.height+secondRectangle.width));
	*/	
	}

}
