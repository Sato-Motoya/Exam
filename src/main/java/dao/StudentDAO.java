package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Student;
import bean.Subject;

public class StudentDAO extends DAO{
	
	private String baseSql;
	
	public Student get(String no) throws Exception{
		
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"select name from student where no = ?");
		st.setString(1, no);
		
		ResultSet rs=st.executeQuery();

		Student student =null;
		
		student.setNo(no);
		student.setName(rs.getString("name"));
		student.setSchool((School)rs.getObject("school"));
		
		return student;
	}
//	PostFilterわからん
	private List<Student> postFilter(ResultSet rSet ,School school) throws Exception{
		List<Student> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from student where school like ? and");
		st.setString(1, school.toString());
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Subject s=new Subject();
			s.setCd(rs.getString("cd"));
			s.setName(rs.getString("name"));
			s.setSchool((School)rs.getObject("school"));
			list.add(s);
		}

		st.close();
		con.close();

		return list;

	}
	
	public List<Student> filter(School school,int entYear,String classNum ,boolean isAttend) throws Exception{
		List<Student> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from student where school_cd = ? and ent_year = ? and class_num = ? and is_attend = ?");
		st.setString(1, school.toString());
		st.setInt(2, entYear);
		st.setString(3, classNum);
		st.setBoolean(4, isAttend);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Student stu=new Student();
			stu.setSchool(school);
			stu.setEntYear(entYear);
			stu.setClassNum(classNum);
			stu.setIsAttend(isAttend);
			stu.setNo(rs.getString("no"));
			stu.setName(rs.getString("name"));
			list.add(stu);
		}

		st.close();
		con.close();

		return list;

	}
	public List<Student> filter(School school,int entYear,boolean isAttend) throws Exception{
		List<Student> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from student where school_cd = ? and ent_year = ? and is_attend = ?");
		st.setString(1, school.toString());
		st.setInt(2, entYear);
		st.setBoolean(3, isAttend);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Student stu=new Student();
			stu.setSchool(school);
			stu.setEntYear(entYear);
			stu.setClassNum(rs.getString("class_num"));
			stu.setIsAttend(isAttend);
			stu.setNo(rs.getString("no"));
			stu.setName(rs.getString("name"));
			list.add(stu);
		}

		st.close();
		con.close();

		return list;

	}
	public List<Student> filter(School school,boolean isAttend)throws Exception{
		List<Student> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from student where school_cd = ? and is_attend = ?");
		st.setString(1, school.toString());
		st.setBoolean(2, isAttend);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Student stu=new Student();
			stu.setSchool(school);
			stu.setEntYear(rs.getInt("ent_year"));
			stu.setClassNum(rs.getString("class_num"));
			stu.setIsAttend(isAttend);
			stu.setNo(rs.getString("no"));
			stu.setName(rs.getString("name"));
			list.add(stu);
		}

		st.close();
		con.close();

		return list;

	}
	public boolean save(Student student) {
		
	}
	public boolean delete(Student student) {
		
	}
}