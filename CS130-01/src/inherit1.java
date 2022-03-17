class Employee11{
 float salary=40000;
}

class inherit1 extends Employee11{
 int bonus=10000;
 public static void main(String args[]){
	 inherit1 p=new inherit1();
   System.out.println("Programmer salary is:"+p.salary);
   System.out.println("Bonus of Programmer is:"+p.bonus);
}
}