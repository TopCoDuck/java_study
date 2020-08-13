package pattern.creational.prototype;

import org.junit.jupiter.api.Test;

class PrototypeTest {

	@Test
	void test() {
		Circle c = new Circle();
		c.setX(5);
		c.setX(10);
		c.setRadius(1);
		///....... 그외 경계선 두께, 색깔등 프로퍼티 정보 
		
		//동일한 원형을 위치만 다르게 해서 복사
		
		Circle copyedCircle = c.copy(2, 3);
		
		System.out.println(c);
		System.out.println(copyedCircle);
	}

}
