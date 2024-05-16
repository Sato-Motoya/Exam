package login_logout;

import bean.Teacher;
import dao.TeacherDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LoginAction extends Action {
	@Override
	public void execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {

		HttpSession session=request.getSession();

		String id=request.getParameter("id");
		String password=request.getParameter("password");
		TeacherDAO dao=new TeacherDAO();
		Teacher teacher=dao.login(id, password);

		if(teacher!=null) {
			session.setAttribute("teacher", teacher);

		request.getRequestDispatcher("../function/mainmenu.jsp").
			forward(request, response);
//			return "login-out.jsp";
		}

		request.getRequestDispatcher("../function/mainmenu.jsp").
		forward(request, response);
//		return"login-error.jsp";

	}

}