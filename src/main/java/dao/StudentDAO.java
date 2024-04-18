package dao;

import java.sql.ResultSet;
import java.util.List;

import bean.School;
import bean.Student;

public class StudentDAO extends DAO{
	
	private String baseSql;
	
	public Student get(String no) {
		
		
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