
public class CondIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num1=18, num2=23;
//condition ? expression1 : expression2

//If the condition is true, expression1 is evaluated;  if it is false, expression2 is evaluated

//System.out.println ("The larger number "+ ((num1>num2)? num1:num2));
		
		//Criteria of Navy selection : 17-39 years old, and 97-271 lb weight 
		
		int age = 50;
		int weight =240;
		
		if (age>=17 && age<=39)
		{
			if (weight>=97 && weight<=271)
				
			{
				System.out.println("You are qualified for joining Navy");
			}
			else 
			{
				System.out.println("You are not qualified due to your weight");
				
			}
					
		}
		else 
		{
			System.out.println("You are not qualified");

			
		}
	
	}

}
