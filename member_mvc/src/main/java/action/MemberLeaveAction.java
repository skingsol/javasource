package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import service.MemberLeaveService;

public class MemberLeaveAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
			
		MemberLeaveService service = new MemberLeaveService();
		boolean deleteFlag = service.leaveMember(userid, password);
		
		String path = "";
		if(deleteFlag) {
			HttpSession session = request.getSession();
			session.invalidate();
			path = "index.jsp";
		}else {
			path = "leave.jsp";
		}
		return new ActionForward(true, path);
	}

}
