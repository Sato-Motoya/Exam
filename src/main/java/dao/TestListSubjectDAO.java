package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.TestListSubject;

public class TestListSubjectDAO extends DAO{

	private String Sql;

	private List<TestListSubject> postFilter(ResultSet rSet) {

	}
	public List<TestListSubject> filter(int entYear,String clasNum,String subject,String school) throws Exception{
		List<TestListSubject> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select test.student_no,test.subject_cd,test.school_cd,test.no,test.point,test.class_num,student.name,student.ent_year from test INNER JOIN student ON test.student_no = student.no where ent_year=? and classs_num subject_cd=? and school_cd=?");
		st.setInt(1, entYear);
		st.setString(2, clasNum);
		st.setString(3, subject);
		st.setString(4, school);

		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			TestListSubject sblst=new TestListSubject();
			sblst.setEntYear(entYear);
			sblst.setClassNum(clasNum);
			sblst.setStudentName(rs.getString("student_no"));
			sblst.setStudentNo(rs.getString("name"));
			sblst.putPoint(rs.getInt("no"),rs.getInt( "point"));
			list.add(sblst);
		}

		st.close();
		con.close();

		return list;

	}
}