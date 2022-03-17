import java.text.NumberFormat;
public class percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 0.5267;
		NumberFormat p = NumberFormat.getPercentInstance();
		System.out.println("Percent format: " + p.format(num));
	}

}
