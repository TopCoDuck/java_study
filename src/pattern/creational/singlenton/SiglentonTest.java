package pattern.creational.singlenton;

import org.junit.jupiter.api.Test;

class SiglentonTest {

	@Test
	void test() {
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		System.out.println("is Same Instance : "+(c1== c2));
	}

}
