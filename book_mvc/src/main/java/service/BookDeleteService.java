package service;

import persistence.BookDAO;

public class BookDeleteService {
	
	public boolean DeleteBook(int code) {
		return new BookDAO().delete(code);
	}
}
