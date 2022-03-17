public class Practice {

	private String firstName;
	private String lastName;
	private String position;
	private double salary;
	private double hoursWorked;
	
	public Practice() {
		this.firstName = "";
		this.lastName = "";
		this.position = "";
		this.salary = 8.25;
		this.hoursWorked=0;
	}//end empty-argument constructor
	
	public Practice(String firstName, String lastName, String position, double salary, double hoursWorked) {
		this.firstName=firstName;
		this.lastName=lastName;
		setPosition(position);
		setSalary(salary);
		setHoursWorked(hoursWorked);
	}//end preferred constructor
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
			this.salary = salary;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
			this.hoursWorked = hoursWorked;
	
	}//end of getter and setter
	public double showCurrentPay() {
		
		double pay = 0.0;
		
		if(hoursWorked<=40)
			pay =  hoursWorked * salary;
		else {
			double overtime = hoursWorked - 40.0;
			pay = (40.0 * salary) + (overtime * salary *1.5);
		}
		
		return pay;
		
	}//end showCurrentPay
	public boolean honorsElligible() {
		boolean result;
		if (hoursWorked>=20) 
		{
			result = true;
		
		}
		else
		{
			result = false;
		   
		}
		return result;
	}

	public String displayPayCheck(){
		
		StringBuilder sb = new StringBuilder();
		sb.append("======" + firstName.toUpperCase() + " " + lastName.toUpperCase() + "======\n");
		sb.append("Hours Worked: " + hoursWorked +"\n");
		sb.append("Position: " + position +"\n");
		sb.append("Salary: " + salary + "/hr\n");
		sb.append("Honors elligible: " + this.honorsElligible()+ "\n");
		
		sb.append("Total Pay: " + this.showCurrentPay()+"\n");
		
		return sb.toString();
		
	}//end displayPayCheck
	
		public static void main(String[] args) {
			Practice r = new Practice("John","Doe","The Boss", 20.00, 19);
			System.out.print(r.displayPayCheck());
	}
	
}//end class