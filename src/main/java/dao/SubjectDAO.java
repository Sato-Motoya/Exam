package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Subject;

public class SubjectDAO extends DAO{

	public Subject get(String cd,String school) throws Exception{
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
				"select name from subject where cd = ? and school_cd = ?");
		st.setString(1, cd);
		st.setString(2, school);

		ResultSet rs=st.executeQuery();

		Subject subject =new Subject();

		subject.setCd(cd);
		subject.setName(rs.getString("name"));
		subject.setSchool(school);

		return subject;
	}

	public List<Subject> filter(String school)throws Exception{
		List<Subject> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from subject where school_cd like ?");
		st.setString(1, school);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Subject s=new Subject();
			s.setCd(rs.getString("cd"));
			s.setName(rs.getString("name"));
			s.setSchool(rs.getString("school_cd"));
			list.add(s);
		}

		st.close();
		con.close();

		return list;
	}

	public boolean save(Subject subject) throws Exception{
		Connection con=getConnection();
		con.setAutoCommit(false);

		PreparedStatement st=con.prepareStatement(
				"insert into subject(school_cd,cd,name) values(?, ?, ?)");
		st.setString(1, subject.getSchool());
		st.setString(2, subject.getCd());
		st.setString(3, subject.getName());
		int line=st.executeUpdate();
		st.close();

		if (line!=1) {
			con.rollback();
			con.setAutoCommit(true);
			con.close();
			return false;
		}
	

	con.commit();
	con.setAutoCommit(true);
	con.close();
	return true;


	}

	public boolean delete(Subject subject) throws Exception{
		Connection con=getConnection();
		con.setAutoCommit(false);

		PreparedStatement st=con.prepareStatement(
				"delete from subject where cd=?");
		st.setString(1, subject.getCd());
		int line=st.executeUpdate();
		st.close();

		if (line!=1) {
			con.rollback();
			con.setAutoCommit(true);
			con.close();
			return false;
		}
	

	con.commit();
	con.setAutoCommit(true);
	con.close();
	return true;


	}
}