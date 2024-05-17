package function;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectUpdateAction extends Action{
	@Override
	public void execute(
			HttpServletRequest request, HttpServletResponse response)throws Exception {

		request.getRequestDispatcher("../function/subject_update.jsp").
			forward(request, response);
	}
}