package regex_exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRegEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String target = "76.103.219.12";
	    String regEx = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
	    // 정규식(regEx)을 패턴으로 만들고,
	    Pattern pat = Pattern.compile(regEx);
	    // 패턴을 타겟 스트링(target)과 매치시킨다.
	    Matcher match = pat.matcher(target);
	    
	    
	    
	    System.out.println(match.find());  // true
	    System.out.println(match.group()); // 2
	    
/*	    System.out.println(match.find());  // true
	    System.out.println(match.group()); // 2
	    
	    System.out.println(match.find());  // true
	    System.out.println(match.group()); // 2
*/	}

}
