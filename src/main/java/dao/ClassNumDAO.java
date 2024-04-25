package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.School;

public class ClassNumDAO extends DAO{
	public List<String> filter(School school) throws Exception{
		List<String> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from school where cd = ?");
		st.setString(1, school.toString());
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			list.add(rs.getString("name"));
		}

		st.close();
		con.close();

		return list;

	}
}