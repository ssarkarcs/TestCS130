
public class LaptopNew1 {
	
	String color;
	int RAM;
	double screen_size;
	
//Creating an attribute of the LaptopNew1 class
	
	public LaptopNew1(String color, int RAM, double screen_size) {
		this.color=color;
		this.RAM=RAM;
		this.screen_size=screen_size;
	}

	public static void main(String[] args) {
	//CReating an instance of LaptopNew1 class for future use
		LaptopNew1 my_laptop=new LaptopNew1("Silver",8, 13.3);
		//A laptop case is given which size is 15 inch. You have to check whether y
		//your laptop can fit to the case
		 if (my_laptop.screen_size<=15)
		 {
			System.out.println("The laptop can fit into the case") ;
		 }
		 else
		 {
			 System.out.println("You need a bigger laptop sleeve") ;
		 }
		 //Checking how the toString() method works
		 
		 System.out.println(my_laptop.color) ; //.toString() method invoked by the compiler automatically
	}

}
