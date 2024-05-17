package function;

import bean.Subject;
import bean.Teacher;
import dao.SubjectDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class SubjectCreateExecuteAction extends Action{
	@Override
	public void execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {

			HttpSession session=request.getSession(); // セッションの開始

			Teacher teacher=((Teacher)session.getAttribute("teacher"));
			String cd=request.getParameter("cd");
			String name=request.getParameter("name");
			String school=teacher.getSchool();
			
			Subject subject=new Subject();
			subject.setCd(cd);
			subject.setName(name);
			subject.setSchool(school);
			
			
			SubjectDAO dao=new SubjectDAO();
			boolean result=dao.save(subject); // 科目登録


			if (result==true) {
				request.getRequestDispatcher("subject_create_done.jsp").
				forward(request, response);
			}
//			return "StudentList.jsp"; // studentList.jspに遷移

		}
}