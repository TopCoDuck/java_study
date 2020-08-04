package generics_exam.inheritance;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class GenricExtendsTest {
	/**
	 * 상위자가 주인이며 대리고 다닐 수 있음
	 */
	@Test
	void test() {
		 //하위자 할당 가능
		  //List<? extends Me> list1 = new ArrayList<Me>();	
		  //List<? extends Me> list1 = new ArrayList<son>();	
		  List<Grandson> grandsonList = new ArrayList<Grandson>();
		  grandsonList.add(new Grandson());
		  grandsonList.add(new Grandson());
		  grandsonList.add(new Grandson());
		  
		  List<? extends Me> list = grandsonList;
		  //extends 주체와 상위자에게 할당 가능
		  //Grandson g = list1.get(0);
		  //Son g = list1.get(0);  //OK
		  Me n = list.get(0);  //OK
		  Object s = list.get(0);  //OK
		  
		  GrandMother gm = (GrandMother) list.get(0);  //OK
		  Grandson gs = (Grandson) list.get(0);  //OK
		  
		  /*
		  * null 제외 add 불가능
		  * 어느 자식이  할됭 되었는지 알 수 없음
		  * Me도 할당 불가능한게 이상함
		  */
		  list.add(null);
		  //list1.add(new Me());
		  //list1.add(new Object());

	}

}
