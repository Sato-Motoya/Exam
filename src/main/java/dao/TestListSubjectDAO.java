package dao;

import java.sql.ResultSet;
import java.util.List;

import bean.School;
import bean.Subject;
import bean.TestListSubject;

public class TestListSubjectDAO extends DAO{
	
	private String Sql;
	
	private List<TestListSubject> postFilter(ResultSet rSet) {
		
	}
	public List<TestListSubject> folter(int entYear,String clasNum,Subject subject,School school) {
		
	}
}