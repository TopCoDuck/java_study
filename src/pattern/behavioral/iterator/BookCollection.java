package pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection implements Collection{
	
	List<Book> bookList = new ArrayList<>();
	
	public BookCollection() {
		
	}
	
	public void add(Book book) {
		bookList.add(book);
	}
	
	
	@Override
	public Iterator createIterator() {
		return (Iterator) new BookIterator(this.bookList);
	}

}
