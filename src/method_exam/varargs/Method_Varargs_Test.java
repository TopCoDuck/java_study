package method_exam.varargs;

import org.junit.jupiter.api.Test;

class Method_Varargs_Test {

	@Test
	void test() throws Exception {
		
		Method_Varargs md = new Method_Varargs();
		String a = "a";
		String b = "b";
		String[] c = {"a","b"};
		
		md.arry_str(a,b);
		
		md.arry_str(c);
		
	}

}
