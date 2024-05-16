package bean;

public class Teacher implements java.io.Serializable {

	// Beanで使用する変数（フィールド名）を宣言
	private String id;
	private String name;
	private String password;
	private String school;

	// データを取得するメソッドを定義
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getSchool() {
		return school;
	}

	// データを設定するメソッドを定義
	public void setId(String id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setSchool(String school) {
		this.school=school;
	}
}