package pattern.behavioral.chain_of_responsibility;

public abstract class CharFilter {
	private CharFilter next;
	
	public CharFilter setNext(CharFilter next) {
		this.next = next;
		return next;
	}
	
	public final void filter(char c) {
		if(check(c)) {
			System.out.println(c+"는 에서 "+CharFilter.class.getName()+"필터링 되었습니다.");
		}else if(next != null) {
			next.filter(c);
		}else {
			System.out.println(c+"는 필터링 되지 않았습니다.");
		}
		
	}
	protected abstract boolean check(char c);
}
