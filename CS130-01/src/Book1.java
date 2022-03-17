
public class Book1 {
int bookId;
String bookName;
Author1 author; //This is the object of the author class, this called aggregation

public Book1(int bookId, String bookName, Author1 author) { //Craete instances
	this.bookId=bookId;
	this.bookName=bookName;
	this.author=author;
}
}
