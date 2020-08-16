package pattern.behavioral.iterator;

import java.util.List;

public class BookIterator implements Iterator {
	Book[] bookList; 
	int pos = 0;
	public  BookIterator (List<Book> bookList) 
	{ 
	    bookList.toArray(this.bookList); 
	} 

	  
	@Override
	public boolean hasNext() {
		return pos <= bookList.length;
	}

	@Override
	public Object next() {
		return bookList[pos];
	}

}
