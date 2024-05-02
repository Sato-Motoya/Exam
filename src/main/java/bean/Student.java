package bean;

import java.time.LocalDate;

public class Student implements java.io.Serializable {

	// Beanで使用する変数（フィールド名）を宣言
	private String no;
	private String name;
	private int entYear;
	private String classNum;
	private boolean isAttend;
	private School school;

	// データを取得するメソッドを定義
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getEntYear() {
		return entYear;
	}
	public String getClassNum() {
		return classNum;
	}
	public boolean getIsAttend() {
		return isAttend;
	}
	public School getSchool() {
		return school;
	}
//	何年生かを返すメソッドだと思われる
	public int getSchoolYear() {
		LocalDate today = LocalDate.now();
		int year=today.getYear();
		return year-entYear+1;
	}

	// データを設定するメソッドを定義
	public void setNo(String no) {
		this.no=no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEntYear(int entYear) {
		this.entYear=entYear;
	}
	public void setClassNum(String classNum) {
		this.classNum=classNum;
	}
	public void setIsAttend(boolean isAttend) {
		this.isAttend=isAttend;
	}
	public void setSchool(School school) {
		this.school=school;
	}
}