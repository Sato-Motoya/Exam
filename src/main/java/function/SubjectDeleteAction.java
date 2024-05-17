package function;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectDeleteAction extends Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)throws Exception {

		String cd=request.getParameter("cd");
		String name=request.getParameter("name");
				
		request.setAttribute("name", name);
		request.setAttribute("cd", cd);
		request.getRequestDispatcher("subject_delete.jsp").
			forward(request, response);
	} {
		
	}
}