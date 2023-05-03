package board.service;

import board.persistence.BoardDAO;

public class BoardDeleteService {
	public boolean remove(int bno, String password) {
		BoardDAO dao = new BoardDAO();
		return dao.delete(bno, password);
	}
	
}
