package exam;

import java.util.List;

import bean.Subject;
import dao.SubjectDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class SubjectListAction extends Action {
	public void execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		HttpSession session=request.getSession(); // セッションの開始

		String school=request.getParameter("ここにIdを");
		SubjectDAO dao=new SubjectDAO();
		List<Subject> list=dao.filter(); // 学生一覧を取得 

		session.setAttribute("list", list); // 学生一覧をlistという名前で保存
		
		request.getRequestDispatcher("subject-list.jsp").
		forward(request, response);

//		return "StudentList.jsp"; // studentList.jspに遷移

	}
}