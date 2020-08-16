package pattern.behavioral.template_method;

public class NaverPaymentService implements PaymentService {

	@Override
	public void payment() {
		System.out.println("네이버 페이 결제");
		
	}

	@Override
	public void refund() {
		System.out.println("네이버 페이 환불");
	}


}
