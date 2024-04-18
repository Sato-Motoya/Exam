package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import bean.School;
import bean.Subject;

public class SubjectDAO extends DAO{
	
	public Subject get(String cd,School school) throws Exception{
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"select name from subject where cd = ? and school = ?");
		st.setString(1, cd);
		st.setString(2, school);
		
		ResultSet rs=st.executeQuery();

		return rs.getString("name");
	}
	
	public List<Subject> filter(School school){
		
	}
	
	public boolean save(Subject subject) {
		
	}
	
	public boolean delete(Subject subject) {
		
	}
}