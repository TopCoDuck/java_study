package pattern.creational.builder;

import org.junit.jupiter.api.Test;

class BuilderTest {

	@Test
	void test() {
		Director htmlDirector = new Director(new HTMLBuilder());
		
		htmlDirector.make();
		
		Director textDirector = new Director(new TextBuilder());
		
		textDirector.make();
		
		WithMethodChaning wmc = new WithMethodChaning.Builder("shpark","1234")
													.tel("01012345678")
													.build();
	}

}
