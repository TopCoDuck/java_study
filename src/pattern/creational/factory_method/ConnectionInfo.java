package pattern.creational.factory_method;
/**
 * 임의의 환경 설정 파일로 생각하
 * 
 */
public class ConnectionInfo {
	private String url = "localhost:3412";
	private String id = "abcdefg";
	private String password = "qwer1234";
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
