
public class StudentStaticNon {
	String name;
	int age;
	//String major="Computer Science";
	static String major="Computer Science";

	public static void main(String[] args) {
		StudentStaticNon Student1=new StudentStaticNon();
		
		Student1.name="Sam";
		Student1.age=20;
		
		StudentStaticNon Student2=new StudentStaticNon();
		Student2.name="Harry";
		Student2.age=21;
		
		//System.out.println("The major for student1 " + Student1.major);
		//System.out.println("The major for student2 " + Student2.major);
		System.out.println("The major for student1 " + StudentStaticNon.major);
	}

}
