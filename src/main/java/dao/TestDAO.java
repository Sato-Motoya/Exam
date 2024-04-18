package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import bean.School;
import bean.Student;
import bean.Subject;
import bean.Test;

public class TestDAO extends DAO{
	
	private String baseSql;
	
	public Test get(Student student,Subject subject,School school,int no) {
		
	}
	private List<Test> postFilter(ResultSet rSet,School school){
		
	}
	public List<Test> filter(int entYear,String classNum,Subject subject,int num, School school){
		
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