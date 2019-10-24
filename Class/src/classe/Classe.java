package classe;

class Book {
	String title;
	
	String Author;
	
	int numberOfPages;
	
	String publisher;
}

public class Classe {
	public static void main(String[] args) {
	
	Book myBook = new Book();
	
	myBook.Author = "Nietzche";
	
	myBook.numberOfPages = 400;
	
	myBook.title = "Ainsi parlait Zarathoustra";
	
	myBook.publisher = "Flammarion";
	
	System.out.println("The name of the book is " + myBook.title + " written by " + myBook.Author + " and it contains " + myBook.numberOfPages + " pages");
	}
}
