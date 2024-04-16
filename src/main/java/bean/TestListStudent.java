package bean;

public class TestListStudent implements java.io.Serializable {

	// Beanで使用する変数（フィールド名）を宣言
	private String subjectName;
	private String subjectCd;
	private int num;
	private int point;

	// データを取得するメソッドを定義
	public String getSubjectName() {
		return subjectName;
	}
	public String getSubjectCd() {
		return subjectCd;
	}
	public int getNum() {
		return num;
	}
	public int getPoint() {
		return point;
	}

	// データを設定するメソッドを定義
	public void setSubjectName(String subjectName) {
		this.subjectName=subjectName;
	}
	public void setSubjectCd(String subjectCd) {
		this.subjectCd=subjectCd;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public void setPoint(int point) {
		this.point=point;
	}
}