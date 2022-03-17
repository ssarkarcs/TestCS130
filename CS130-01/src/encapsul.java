
public class encapsul {
	// private variables declared, these can only be accessed by public methods of class
	private String name;
	private int age;

	 // get method for name access
	public String getName() {
		return name;
	}
	 // get method for age access
	public int getAge() {
		return age;
	}
	//set method for name. It also work similar to JAVA constructor
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}

	
	public static void main(String[] args) {
		encapsul obj=new encapsul();
		obj.setName("Sam");
		obj.setAge(20);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
				
	}

}
