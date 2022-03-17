
public class ArrayTestFor_For_Each {

	public static void main(String[] args) {
	double [] arr1= new double [10];
	arr1[0]=12.23;
	arr1[1]=34.23;
	arr1[2]=67.23;
	arr1[3]=56.23;
	arr1[4]=23.12;
	arr1[5]=56.98;
	arr1[6]=45.34;
	arr1[7]=23.89;
	arr1[8]=34.78;
	arr1[9]=67.34;
	// For Loop to display all the array elements
	for(int i = 0; i<arr1.length;i++) {
		System.out.println("The elements index: " + i + ", The element is :"
				   + arr1[i]);
	//For each loop to display all array elements
			
	}
	int index=0;
	for(double element: arr1) {
		
		System.out.println("The elements index: " + (index++) + ", The element using for each loop: " +element);
	}
		
	}

}
