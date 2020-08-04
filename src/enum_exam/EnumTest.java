package enum_exam;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

//https://opentutorials.org/module/1226/8025
class EnumTest {

	@Test
	void test() {
		
		System.out.println(Enum_Default.EN.ordinal());
		System.out.println(Enum_Default.EN.name());
		
		System.out.println(Enum_Default.EN.equals(Enum_Default.EN));
		String company2Json = new Gson().toJson(Enum_Default.EN);
		System.out.println(company2Json);
		//Enum_Default.EN
		System.out.println(Enum_Extend.API);
		
		String company2Json2 = new Gson().toJson(Enum_Extend.API);
		System.out.println(company2Json2);
		
		System.out.println(Enum_Extend.API==Enum_Extend.API);
		
	}
/*
 * 
0
EN
true
"EN"
API
"API"
true
 */
}
