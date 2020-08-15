package pattern.structural.facade;

public class MemberMapper {
	public boolean checkDupMail(String email) {
		return false;
	}
	
	public void insert(String email,String password) {
		System.out.println("회원 정보를");
	}
}
