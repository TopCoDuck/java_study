package pattern.structural.adapter;

import org.junit.jupiter.api.Test;

class AdapterTest {

	@Test
	void test() {
		Using using = new Using(new PrinterAdapter(new PrinterImpl()));
		using.print();
	}

}
