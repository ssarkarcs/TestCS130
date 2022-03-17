
public class Encapsulation2 {
 private String make;
 private String model;
 private int screensize;
 private boolean hasGPU;
 //Getter method for the private class
 public String getMake() {
	 return make;
 }
 public String getModel() {
	 return model;
 }
 public int getScreenSize() {
	 return screensize;
 }
 public boolean getHasGPU() {
	 return hasGPU;
 }
 //Setter for all of the methods
 public void setMake(String make) {
	 this.make=make;
 }
 public void setModel(String model) {
	 this.model=model;
 }
 public void setScreenSize(int screensize) {
	 this.screensize=screensize;
 }
 public void setHasGPU(boolean hasGPU) {
	 this.hasGPU=hasGPU;
 }
 
	public static void main(String[] args) {
		Encapsulation2 myLaptop=new Encapsulation2();
	myLaptop.setMake("Microsoft");
myLaptop.setModel("Surface");
myLaptop.setScreenSize(13);
myLaptop.setHasGPU(false);
System.out.println("My laptop make"+myLaptop.getMake());
System.out.println("My laptop model"+myLaptop.getModel());
System.out.println("My laptop screensize"+myLaptop.getScreenSize());
System.out.println("My laptop has GPU?"+myLaptop.getHasGPU());

	}

}
