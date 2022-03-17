
public class Aggregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create author first then add it to book1
Author1 author1= new Author1("Sam", 29);
Book1 book1= new Book1(23, "JAVA", author1);
//hexadecimal value only print book1.author
System.out.println(book1.author.authorName);
	}

}
