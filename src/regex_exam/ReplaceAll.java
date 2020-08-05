package regex_exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAll {

	public static void main(String[] args) {

		 	String target = "나는 2008년도에 입학했다.";
		    String regEx = "[0-9]";
		    Pattern	pat = Pattern.compile(regEx);
		   
		    Matcher m = pat.matcher(target);
		    String result = m.replaceAll("2"); // 패턴과 일치할 경우 "2"로 변경
		    
		    System.out.println("출력 : " + result);
	}

}
