
public class ArrTest2 {
    public static void main (String[] args)
    {

	Student22[] arr=new Student22[5]; // allocating memory for 5 objects of type Student.
	arr[0] = new Student22(1,"Sam"); // initialize the first elements of the array
	arr[1] = new Student22(2,"Harry"); // initialize the second elements of the array
	        // so on...
	        arr[2] = new Student22(3,"Noel");
	        arr[3] = new Student22(4,"Josh");
	        arr[4] = new Student22(5,"Henry");
	// accessing the elements of the specified array
	        for (int i = 0; i < arr.length; i++)
	            System.out.println("Element at " + i + " : " + "Roll No: " + arr[i].roll_no +", Name:  "+ arr[i].name);

	     
}

}