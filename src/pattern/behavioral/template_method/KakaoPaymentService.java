package pattern.behavioral.template_method;

public class KakaoPaymentService implements PaymentService{

	@Override
	public void payment() {
		System.out.println("카카오 페이 결제");
		
	}

	@Override
	public void refund() {
		System.out.println("카카오 페이 환불");
	}

}
