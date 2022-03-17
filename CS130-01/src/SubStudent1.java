
public class SubStudent1 {

	public static void main(String[] args) {
		// Create an instance of the main class named Student1
Student1 firstStudent=new Student1();
firstStudent.Name="Emily";
firstStudent.Age=19;
firstStudent.Major="Computer Science";
firstStudent.GPA=3.2;
System.out.println("Printing the major of my first student: "+firstStudent.Major);

Student1 secondStudent=new Student1();
secondStudent.Age=21;
secondStudent.Name="Jack";
secondStudent.GPA=3.0;
secondStudent.Major="Physics";
System.out.println("Printing the age of my second student: "+secondStudent.Age);

	}

}
