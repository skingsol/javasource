package board.service;

import java.util.List;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardSearchService {
	public List<BoardDTO> search(String criteria, String keyword){
		BoardDAO dao = new BoardDAO();
		return dao.searchRows(criteria, keyword);
		
		
	}
}
