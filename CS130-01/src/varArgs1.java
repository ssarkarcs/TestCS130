
public class varArgs1 {

public static int sum(int...list) {
	int total = 0;
	for (int i = 0; i<list.length; i++) {
		total+= list[i];
	}
	return total;
}
	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5};
		System.out.println(sum(6,7,5,10));
		System.out.println(sum(4,5,6,7,8,9,10));
	}
}