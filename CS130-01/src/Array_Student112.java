
public class Array_Student112 {

	public static void main(String[] args) {
Student112 [] arr2=new Student112 [5];
//allocating memory space for 5 objects of type Student112

arr2[0]=new Student112("Sam", 12);//initialize first element of the array
arr2[1]= new Student112 ("Harry", 11);
arr2[2]= new Student112 ("Lacy", 10);
arr2[3]= new Student112 ("Peter", 23);
arr2[4]= new Student112 ("Henry", 45);

//Printing all the array element using for loop
for (int i =0; i<arr2.length; i++) {
	System.out.println("The index of the elements: "+ i + 
			", The array element name: " +arr2[i].name
			+ ", The array element roll_no : "+ arr2[i].roll_no);
}
	} 

}
