package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Student;
import bean.Subject;
import bean.Test;

public class TestDAO extends DAO{

	private String baseSql;

	public Test get(Student student,Subject subject,School school,int no) throws Exception{

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
				"select name from test where student_no = ? and subject_cd = ? and school_cd = ? and no = ?");
		st.setString(1,student.toString());
		st.setString(2, subject.toString());
		st.setString(3, school.toString());
		st.setInt(4, no);

		ResultSet rs=st.executeQuery();

		Test test =null;

		test.setNo(no);
		test.setStudent(student);
		test.setSubject(subject);
		test.setSchool(school);
		test.setClassNum(rs.getString("class_num"));
		test.setPoint(rs.getInt("point"));

		return test;
	}
	private List<Test> postFilter(ResultSet rSet,School school){

	}
	public List<Test> filter(int entYear,String classNum,Subject subject,int no, School school) throws Exception{
		List<Test> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from student where ent_year = ? and class_num = ? and subject_cd = ? no = ? and school_cd = ?");
		st.setInt(1, entYear);
		st.setString(2, classNum);
		st.setString(3, subject.toString());
		st.setInt(4, no);
		st.setString(5, school.toString());
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Test test=new Test();
			test.setNo(no);
			test.setStudent((Student)rs.getObject("stuent_no"));
			test.setSubject(subject);
			test.setSchool(school);
			test.setClassNum(classNum);
			test.setPoint(rs.getInt("point"));
			list.add(test);
		}

		st.close();
		con.close();

		return list;

	}

	public boolean save(List<Test> list) {

	}

	private boolean save(Test test,Connection connection) {

	}

	public boolean delete(List<Test> list) {

	}

	private boolean delete(Test test,Connection connection) {

	}
}