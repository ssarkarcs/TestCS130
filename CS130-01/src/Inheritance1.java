
public class Inheritance1 {
	float salary=40000;  
	}  
	class Programmer extends Inheritance1{  
	 int bonus=10000;  

	 public static void main(String args[]){  
	   Programmer newp=new Programmer();  
	   System.out.println("Programmer salary is:"+newp.salary);  
	   System.out.println("Bonus of Programmer is:"+newp.bonus);  
	}  

}
