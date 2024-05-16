package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Subject;

public class SubjectDAO extends DAO{

	public Subject get(String cd,School school) throws Exception{
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
				"select name from subject where cd = ? and school_cd = ?");
		st.setString(1, cd);
		st.setString(2, school.getCd());

		ResultSet rs=st.executeQuery();

		Subject subject =new Subject();

		subject.setCd(cd);
		subject.setName(rs.getString("name"));
		subject.setSchool(school);

		return subject;
	}

	public List<Subject> filter(School school)throws Exception{
		List<Subject> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from subject where school_cd like ?");
		st.setString(1, school.getCd());
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

	public boolean save(Subject subject) {

	}

	public boolean delete(Subject subject) {

	}
}