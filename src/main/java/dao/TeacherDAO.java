package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.School;
import bean.Teacher;

public class TeacherDAO extends DAO{
	
	public Teacher get(String id) throws Exception{
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"select name from teacher where id = ?");
		st.setString(1, id);
		
		ResultSet rs=st.executeQuery();

		Teacher teacher =null;
		
		teacher.setId(id);
		teacher.setName(rs.getString("name"));
		teacher.setSchool((School)rs.getObject("school"));
		teacher.setPassword("password");
		
		return teacher;
	}
	public Teacher login(String id,String password) throws Exception{
			Teacher teacher=null;

			Connection con=getConnection();

			PreparedStatement st;
			st=con.prepareStatement(
				"select * from teacher where id=? and password=?");
			st.setString(1, id);
			st.setString(2, password);
			ResultSet rs=st.executeQuery();

			while (rs.next()) {
				teacher=new Teacher();
				teacher.setId(rs.getString("id"));
				teacher.setName(rs.getString("name"));
				teacher.setPassword(rs.getString("password"));
				teacher.setSchool((School)rs.getObject("school"));
			}

			st.close();
			con.close();
			return teacher;

	}
}