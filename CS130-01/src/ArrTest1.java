
public class ArrTest1 {

	public static void main(String[] args) {
	
		int[] arr =  new int[5];      // allocating memory for 5 integers.
	      // initialize the first elements of the array
	      arr[0] = 10;
	          
	      // initialize the second elements of the array
	      arr[1] = 20;
	          
	      //so on...
	      arr[2] = 30;
	      arr[3] = 40;
	      arr[4] = 50;
	          
	      // accessing the elements of the specified array
	      for (int i = 0; i < arr.length; i++)
	    	  System.out.println("For Element at index " + i + 
                      " : "+ arr[i]); 
	      int index = 0; 
	      for(int element: arr)
	      {
	    	  System.out.println("ForEach Element at index " +(index++) +" : "+ element); 
	      }
	}

}
