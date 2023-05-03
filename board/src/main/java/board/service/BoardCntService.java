package board.service;

import board.persistence.BoardDAO;

public class BoardCntService {
	public boolean cntUpdate(int bno) {
		BoardDAO dao = new BoardDAO();
		
		return dao.readCnt(bno);
		//return new BoardDAO().readCnt(bno);
	}
}
