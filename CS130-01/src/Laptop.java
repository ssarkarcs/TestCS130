
public class Laptop {
	String make;
	String model;
	double screen_size;
	boolean hasGPU;
	
public Laptop(String make, String model, double screen_size, boolean hasGPU)
{
	this.make=make;
	this.model=model;
	this.screen_size=screen_size;
	this.hasGPU=hasGPU;
}



	public static void main(String[] args) {
	Laptop MyLaptop=new Laptop("Microsoft","Surface",13.3,false);
/*	MyLaptop.make="Microsoft";
	MyLaptop.model="Surface Pro";
	MyLaptop.screen_size=13.3;
	MyLaptop.hasGPU=false;
*/	
	System.out.println("Do my laptop has GPU?  " + MyLaptop.hasGPU);
	}
}
