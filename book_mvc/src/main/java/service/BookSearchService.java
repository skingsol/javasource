package service;

import java.util.List;

import domain.BookDTO;
import persistence.BookDAO;

public class BookSearchService {
	
		public List<BookDTO> list(String criteria, String keyword){
//			BookDAO dao = new BookDAO();
//			return dao.update(code, price);
			return new BookDAO().search(criteria, keyword);  //위에 두줄 한줄로.
		}
	
}
