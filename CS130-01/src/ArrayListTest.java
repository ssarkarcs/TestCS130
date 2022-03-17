import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
names.add("John");
names.add("Jenny");
names.add("Harry");
names.add("Ron");
System.out.println(names);
System.out.println("The first element of the arrayList: "+names.get(0));
System.out.println("Access Harry from arrayList: "+names.get(2));
names.set(1, "Anny");
System.out.println("The updated list: " + names);
names.remove(1);
System.out.println("The updated list without Anny: " + names);
System.out.println("The size of array list: " + names.size());
//names.clear();
//System.out.println(names);
for(int i = 0; i<names.size();i++)
{
	System.out.println(names.get(i));
}
//For each method
for(String x:names)
{
	System.out.println("Using For each method "+ x);
}
	}

}
