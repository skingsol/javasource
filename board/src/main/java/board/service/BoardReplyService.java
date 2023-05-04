package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardReplyService {
	public boolean reply(BoardDTO updateDto) {
		BoardDAO dao = new BoardDAO();
		return dao.reply(updateDto);
	}
}
