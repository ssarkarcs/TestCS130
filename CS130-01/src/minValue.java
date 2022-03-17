
public class minValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double num1=7,num2=6,num3=5,min=0;
if (num1<num2)
	if (num1<num3)
		min = num1;
	else 
		min =num3;
else
	if(num2<num3)
		min=num2;
	else 
		min=num3;

System.out.println(min);



	}

}
