
public class WhileForComp {

	public static void main(String[] args) {
		//Adding 1000 numbers starting from 1 using while and for loop
		
		int i, j;
		i = 1;
		double Sum_while=0, Sum_for=0;
		while(i<=1000)
		{
			Sum_while+=i; //Sum_while=sum_while+1
			i++;
		}
		
System.out.println("Addition of 1000 numbers using while loop: "+ Sum_while);
        for(j=1; j<=1000; j++)
        {
        	Sum_for+=j;
        }
        System.out.println("Addition of 1000 numbers using for loop: "+ Sum_for);     
	}

}
