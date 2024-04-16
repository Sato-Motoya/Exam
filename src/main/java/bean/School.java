package bean;

public class School implements java.io.Serializable {

	// Beanで使用する変数（フィールド名）を宣言
	private String cd;
	private String name;

	// データを取得するメソッドを定義
	public String getCd() {
		return cd;
	}
	public String getName() {
		return name;
	}


	// データを設定するメソッドを定義
	public void setCd(String cd) {
		this.cd=cd;
	}
	public void setName(String name) {
		this.name=name;
	}

}