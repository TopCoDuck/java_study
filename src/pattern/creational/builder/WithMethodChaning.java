package pattern.creational.builder;
/**
 * tel 같은 선택적인 값은 체인닝 형태로 정의
 * 
 */
public class WithMethodChaning {
	
	private final String id;
	private final String password;
	private String tel;

	public static class Builder{
		private final String id;
		private final String password;
		private String tel;
		
		public Builder(String id,String password) {
			this.id = id;
			this.password = password;
		}
		
		public Builder tel(String tel) {
			this.tel = tel;
			return this;
		}
		
		public WithMethodChaning build() {
			return new WithMethodChaning(this);
		}
	}
	
	private WithMethodChaning(Builder builder) {
		this.id = builder.id;
		this.password = builder.password;
	}


}
