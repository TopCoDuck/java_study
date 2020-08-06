package pattern.creational.builder;

import java.util.Arrays;

public class Director {
	
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder  = builder;
	}
	
	public void make() {
		builder.makeTitle("빌터 패턴 - 나라 선택");
		builder.makeList(Arrays.asList("한국","일본","중국"));
		builder.build();
	}
	
}
