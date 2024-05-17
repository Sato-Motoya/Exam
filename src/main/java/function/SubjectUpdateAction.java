package function;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectUpdateAction extends Action{
	@Override
	public void execute(
			HttpServletRequest request, HttpServletResponse response)throws Exception {

		String cd=request.getParameter("cd");
		request.setAttribute("cd", cd);

		request.getRequestDispatcher("subject_update.jsp").
			forward(request, response);
	}
}