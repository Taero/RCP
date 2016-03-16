package com.starterkit.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.starterkit.model.*;

public class BookDao {
	private Set<BookTo> books;

	public BookDao() {
		books = new HashSet<>();
		addTestBooks();
	}
	
    public List<BookTo> findAll() {
        return new ArrayList<>(books);
    }

    public List<BookTo> findBookByTitle(String title) {
    	List<BookTo> found = new ArrayList<BookTo>();
    	for (BookTo book : books) {
    		if (book.getTitle().toLowerCase().startsWith(title.toLowerCase())) {
    			found.add(book);
    		}
    	}
        return found;
    }
    
    public List<BookTo> findBooksByAuthor(String author) {
    	List<BookTo> found = new ArrayList<BookTo>();
    	for (BookTo book : books) {	
    		if (book.getAuthor().toLowerCase().equals(author.toLowerCase())) {
    			found.add(book);
    		}
    	}
        return found;
    }
    
    public BookTo changeBook(BookTo book) {
    	removeBook(book.getId());    	
    	return save(book);
    }
	
    public BookTo save(BookTo book) {
        books.add(book);
        return book;
    }
    
    public void removeBook(BookTo book) {
    	books.remove(book);
    }
    
    public void removeBook(long id) {
    	for (BookTo book : books) {	
    		if (book.getId() == id) {
    			books.remove(book);
    		}
    	}
    }
	
	private void addTestBooks() {
		books.add(new BookTo(1L, "Romeo i Julia", "Wiliam Szekspir"));
		books.add(new BookTo(2L, "Opium w rosole", "Hanna Ożogowska"));
		books.add(new BookTo(3L, "Przygody Odyseusza", "Jan Parandowski"));
		books.add(new BookTo(4L, "Awantura w Niekłaju", "Edmund Niziurski"));
		books.add(new BookTo(5L, "Pan Samochodzik i Fantomas", "Zbigniew Nienacki"));
		books.add(new BookTo(6L, "Zemsta", "Aleksander Fredro"));
		books.add(new BookTo(7L, "Zemsta Sithów", "Aleksander Dumas"));
		books.add(new BookTo(8L, "Pan Starosta", "Fryderyk Skarbek"));
	}
}
