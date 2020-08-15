package pattern.structural.facade;

public class MemberService {
	
	private MemberMapper memberMapper;
	private MailService mailService;
	
	public void join(String email,String password) {
		if(!memberMapper.checkDupMail(email)) {
			memberMapper.insert(email, password);
			mailService.sendMail(email);
		};
	}
}
