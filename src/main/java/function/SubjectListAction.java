package function;

import java.util.List;

import bean.Subject;
import bean.Teacher;
import dao.SubjectDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class SubjectListAction extends Action {
	@Override
	public void execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		HttpSession session=request.getSession(); // セッションの開始

		Teacher teacher=((Teacher)session.getAttribute("teacher"));
		String school=teacher.getSchool();
		
		
		SubjectDAO dao=new SubjectDAO();
		List<Subject> list=dao.filter(school); // 科目一覧を取得

		session.setAttribute("list", list); // 科目一覧をlistという名前で保存

		request.getRequestDispatcher("subject_list.jsp").
		forward(request, response);

//		return "StudentList.jsp"; // studentList.jspに遷移

	}
}