package login_logout;

import bean.Teacher;
import jakarta.servlet.http.HttpServletRequest;
import tool.Action;

public class LoginAction extends Action {
	public String execute(
			HttpServletRequest request, HttpServleResponse response
		) throws Exception {
		
		HttpSesstion session=request.getSession();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		TeacherDAO dao=new TeacherDAO();
		Teacher teacher=dao.search(name, password);
		
		if(teacher!=null) {
			session.setAttribute("teacher", teacher);
			return "login-out.jsp";
		}
		
		return"login-error.jsp";
		
	}

}