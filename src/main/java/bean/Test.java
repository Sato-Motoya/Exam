package bean;

public class Test implements java.io.Serializable {

	// Beanで使用する変数（フィールド名）を宣言
	private String student;
	private String classNum;
	private String subject;
	private String school;
	private int no;
	private int point;

	// データを取得するメソッドを定義
	public String getStudent(){
		return student;
	}
	public String getClassNum() {
		return classNum;
	}
	public String getSubject() {
		return subject;
	}
	public String getSchool() {
		return school;
	}
	public int getNo() {
		return no;
	}
	public int getPoint() {
		return point;
	}


	// データを設定するメソッドを定義
	public void setStudent(String student) {
		this.student=student;
	}
	public void setClassNum(String classNum) {
		this.classNum=classNum;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public void setSchool(String school) {
		this.school=school;
	}
	public void setNo(int no) {
		this.no=no;
	}
	public void setPoint(int point) {
		this.point=point;
	}
}