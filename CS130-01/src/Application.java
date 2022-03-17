
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student myfirstStudent = new Student(); //Student object, instance of class
		myfirstStudent.Name = "Anisha Caroll";
		myfirstStudent.Age = 19;
		myfirstStudent.Major="Business";
		myfirstStudent.GPA = 3.2;
		myfirstStudent.hasGPU=true;
		System.out.println(myfirstStudent.hasGPU);
		
		Student mySecondStudent = new Student();
		mySecondStudent.Name="Rick";
		mySecondStudent.Age=19;
		System.out.println(mySecondStudent.Age);
	}

}
