
public class EncapsulCircle {

	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	 public double areaCircle() {
		 double area = Math.PI*(radius*radius);
		 return area;
	 }
	public double periCircle() {
		double perimeter= 2* Math.PI*radius;
		return perimeter;
	}  
	 
	public static void main(String[] args) {
		EncapsulCircle Circle1 = new EncapsulCircle();
		Circle1.setRadius(10.22);
		System.out.println("The area of the circle is: " +Circle1.areaCircle());
		System.out.println("The perimeter of the circle is: " +Circle1.periCircle());
	}

}
