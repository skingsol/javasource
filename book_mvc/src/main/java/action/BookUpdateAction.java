package action;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookUpdateService;

public class BookUpdateAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		int code = Integer.parseInt(request.getParameter("code"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		BookUpdateService service = new BookUpdateService();
		boolean updateFlag = service.updateBook(code, price);
		
		String path = "";
		if(updateFlag) {
			path = "list.do";
		}else {
			path = "modify.do?code="+code;
		}
		return new BookActionForward(true, path);
	}

}
