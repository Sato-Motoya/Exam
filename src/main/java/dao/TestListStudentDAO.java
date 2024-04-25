package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import bean.TestListStudent;

public class TestListStudentDAO extends DAO{
	
	private String Sql;
	
	private List<TestListStudent> postFilter(ResultSet rSet) {
		
	}
	public List<TestListStudent> filter(Student student) throws Exception{
		List<TestListStudent> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from test INNER JOIN subject ON test.subject_cd = subject.cd where student_no = ?");
		st.setString(1, student.toString());

		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			TestListStudent stlst=new TestListStudent();
			stlst.setNum(rs.getInt("no"));
			stlst.setPoint(rs.getInt("point"));
			stlst.setSubjectCd(rs.getString("subject_cd"));
			stlst.setSubjectName(rs.getString("name"));
			list.add(stlst);
		}

		st.close();
		con.close();

		return list;

	}
}