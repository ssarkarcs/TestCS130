
public class Employee {
private String firstName;
private String lastName;
private String position;
private double salary;
private double hoursWorked;
	
public Employee()	//empty argument constructor
{
	this.firstName= " ";
	this.lastName=" ";
	this.position= " ";
	this.salary= 8.25;
	this.hoursWorked=0.0;
}
//preferred argument constructor
public Employee(String firstName, String lastName, String position, double salary, double hoursWorked)	
{
	this.firstName=firstName;
	this.lastName=lastName;
	this.position= position;
	this.salary = salary;
	this.hoursWorked=hoursWorked;
}
//Getters
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getPosition() {
		return position;
	}
	public double getSalary() {
		return salary;
	}
	public double gethoursWorked() {
		return hoursWorked;
	}
	
	//Setter (Similar to the constructor)
	public void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	
	public void setPosition(String position) {
		this.position=position;
	}
	public void setSalary(double salary) {
		this.salary= salary;
	}
public void sethoursWorked(double hoursWorked) {
	this.hoursWorked=hoursWorked;
}
	public double showCurrentPay() {
		double pay=0.0;
		if (hoursWorked<=40) {
			pay=hoursWorked*salary;
		}
		else
		{
			double overtime = hoursWorked-40.0;
			pay=(40*salary)+(overtime*salary*1.5);
		}
		return pay;
		
	}
	
	public String displayPayCheck() {
		StringBuilder sb= new StringBuilder();
		sb.append("=====" +firstName.toUpperCase()+" "+lastName.toUpperCase()+"=====\n");
		sb.append("Hours Worked : " + hoursWorked +"\n");
		sb.append("Position :"+ position +"\n");
		sb.append("Salary : " +salary +"\n");
		sb.append("Total Pay: " +this.showCurrentPay() +"\n");
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Employee person1 =new Employee("John", "Doe", "The Boss", 20.00, 30);
		System.out.println(person1.displayPayCheck());
		Employee person2 = new Employee("Harry", "Potter", "Actor", 200.00, 41);{
			System.out.println(person2.displayPayCheck());
		}

	}

}
