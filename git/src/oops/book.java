package oops;

public class book {
	String bookName;
	String authorName;
	String authorAdd;
	String isbn;
	int price;
	public book(String bookName, String authorName, String authorAdd,
			String isbn, int price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.authorAdd = authorAdd;
		this.isbn = isbn;
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [bookName=" + bookName + ", authorName=" + authorName
				+ ", authorAdd=" + authorAdd + ", isbn=" + isbn + ", price="
				+ price + "]";
	}
	
	

}
