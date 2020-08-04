package generics_exam.inheritance;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class GenricsSuperTest {
	/**
	 * 상위자를 받아 와서
	 */
	@Test
	void test() {
		   	List<? super Me> list = new ArrayList<GrandMother>();
		   	
		    list.add(null);  //OK
		    list.add(new Me());  //OK
		    list.add(new Son());  //OK
		    list.add(new Grandson());  //OK
		    
		    Object o = list.get(0);  //OK
		    GrandMother gm = (GrandMother) list.get(0);  //OK
		    Mother g = (Mother) list.get(0);  //OK
		    Son s  = (Son) list.get(0);  //OK
		   // list.add(new Mother());  //OK
		   // list.add(new GrandMother());  //OK
		    

	}

}
