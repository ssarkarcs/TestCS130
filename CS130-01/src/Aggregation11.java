
public class Aggregation11 {

	public static void main(String[] args) {
		Author authorone = new Author("Jack", 28);
		Book book1 = new Book(23, "JAVA", authorone);
		
		System.out.println("Book ID: " + book1.bookId);
		System.out.println("Book Name: " + book1.bookName);
		System.out.println("Author name: " + book1.author1.name);
		System.out.println("Author age: " + book1.author1.age);

	}

}
