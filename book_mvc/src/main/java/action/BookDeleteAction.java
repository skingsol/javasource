package action;

import javax.servlet.http.HttpServletRequest;

import service.BookDeleteService;

public class BookDeleteAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		int code = Integer.parseInt(request.getParameter("code"));
		
		BookDeleteService service = new BookDeleteService();
		boolean deleteFlag = service.DeleteBook(code);
		
		String path = "";
		if(deleteFlag) {
			path = "list.do";
		}else {
			path = "modify.do?code"+code;
		}
		return new BookActionForward(true, path);
	}

}
