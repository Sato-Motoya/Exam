package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import bean.School;
import bean.Student;

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
	
	private List<Student> postFilter(ResultSet rSet ,School school) {
		
	}
	
	public List<Student> filter(School school,int entYear,String classNum ,boolean isAttend){
		
	}
	public List<Student> filter(School school,int entYear,boolean isAttend){
		
	}
	public List<Student> filter(School school,boolean isAttend){
		
	}
	public boolean save(Student student) {
		
	}
	public boolean delete(Student student) {
		
	}
}