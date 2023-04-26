package action;

import javax.servlet.http.HttpServletRequest;

import service.InsertService;

public class InsertAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		//get or post 넘어오는 내용 가져오기
		System.out.println("이름 "+request.getParameter("name"));
		
		
		//서비스 호출
		InsertService service = new InsertService();
		boolean result = service.insertArticle();
		
		if(result) {
			
		}
		
		//return 페이지 이동방식, 페이지
		//sendRedirect 방식일 때는 true, forward 방식일 때는 false 사용
		return new ActionForward(true, "list.jsp");
	}
	
}
