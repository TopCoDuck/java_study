package regex_exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRegEx2 {

	public static void main(String[] args) {
		 String target = "2018-08-03|10001|A02";
		 String regEx = "^2018-08-0[2-9].*";
		 
		 if (target.matches(regEx)) {
		        System.out.println("일치");
		 } else {
		        System.out.println("불일치");
		 }
	}

}
