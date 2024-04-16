package bean;

import java.util.Map;

public class TestListSubject implements java.io.Serializable {

	// Beanで使用する変数（フィールド名）を宣言
	private int entYear;
	private String studentNo;
	private String studentName;
	private String classNum;
	private Map<Integer, Integer> points;

	// データを取得するメソッドを定義
	public int getEntYear() {
		return entYear;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getClassNum() {
		return classNum;
	}
	public Map<Integer, Integer> getPoints() {
		return points;
	}
	public String getPoint(int key) {
		return points.get(key).toString();
	}

	// データを設定するメソッドを定義
	public void setEntYear(int entYear) {
		this.entYear=entYear;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo=studentNo;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setClassNum(String classNum) {
		this.classNum=classNum;
	}
	public void putPoint(int key,int value) {
		this.points.put(key,value);
	}
}