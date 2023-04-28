package action;

import javax.servlet.http.HttpServletRequest;

import domain.MemberDTO;
import service.MemberRegisterService;

public class MemberRegisterAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		MemberDTO dto = new MemberDTO(userid, password, name, gender, email);
				
		MemberRegisterService service = new MemberRegisterService();
		boolean insertFlag = service.memberInsert(dto);
		
		String path="";
		if(insertFlag) {
			path = "login.jsp";
		}else {
			path = "register.jsp";
		}
		
		return new ActionForward(true, path);
	}

}
