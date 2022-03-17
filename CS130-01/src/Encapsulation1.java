
public class Encapsulation1 {
private String name;
private int age;
private String major;
private double GPA;
	//Getter methods
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getMajor() {
	return major;
}

public double getGPA() {
	return GPA;
}
//Setter method. It work similar as JAVA Constructor

public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age=age;
}
public void setMajor(String major) {
	this.major=major;
}
public void setGPA(double GPA) {
	this.GPA=GPA;
}

	public static void main(String[] args) {
		//Created an instance of the Encapsulation1 class
		Encapsulation1 obj =new Encapsulation1();
		obj.setName("Sam");
		obj.setAge(20);
		obj.setMajor("ComputerScience");
		obj.setGPA(3.5);
		System.out.println("The name is: "+obj.getName());
		System.out.println("The age of the person : "+ obj.getAge());
		System.out.println("The major of the person : "+ obj.getMajor());
		System.out.println("The GPA of the person : "+ obj.getGPA());

	}

}
