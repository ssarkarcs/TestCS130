
public class LaptopNew {

	String Color;
	int RAM;
	double size;


//Attributes
public LaptopNew(String Color, int RAM, double size)
{
	this.Color=Color;
	this.RAM=RAM;
	this.size=size;
}
	
	
	public static void main(String[] args) {
		LaptopNew mylaptop=new LaptopNew("Silver", 8, 13.3);
		LaptopNew ronlaptop=new LaptopNew("Gray", 16, 17);
		int case_size=15;
		if (ronlaptop.size<=case_size)
		{
			System.out.println("The laptop fit into the case");
		}
		else
		{
			System.out.println("The laptop not fit into the case");	
		}

	}

}
