package service;

import java.util.List;

import domain.BookDTO;
import persistence.BookDAO;

// ~~ service 클래스의 하는일 : 비즈니스 로직을 처리함
// 비즈니스 로직 : insert, update, delete, select 처리를 위한 메소드를 호출하는 작업

public class BookListService {
	
	public List<BookDTO> list() {
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.getList();
		
		
		return list;
	}

}
