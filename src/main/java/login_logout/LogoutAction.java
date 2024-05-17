package login_logout;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LogoutAction extends Action {
	@Override
	public void execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {

		HttpSession session=request.getSession();

		if (session.getAttribute("teacher")!=null) {
			session.removeAttribute("teacher");

			request.getRequestDispatcher("../function/mainmenu.jsp").
				forward(request, response);

		}


		request.getRequestDispatcher("../function/mainmenu.jsp").
			forward(request, response);

	}

}