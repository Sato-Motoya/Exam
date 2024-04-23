package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.School;

public class SchoolDAO extends DAO{
	
	public School get(String cd) throws Exception{
		
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"select name from school where cd = ?");
		st.setString(1, cd);
		
		ResultSet rs=st.executeQuery();

		School school =null;
		
		school.setCd(cd);
		school.setName(rs.getString("name"));
		
		return school;
	}
}