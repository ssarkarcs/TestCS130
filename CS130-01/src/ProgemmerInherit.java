
class Employee113{
	float salary=2333.33f;
}

public class ProgemmerInherit extends Employee113 {
	int bonus=400;
	//ProgemmerInherit child class
	//Employee113  parent class

	public static void main(String[] args) {
		ProgemmerInherit p1 = new ProgemmerInherit();
		System.out.println(p1.bonus);
		System.out.println(p1.salary);
	}

}
