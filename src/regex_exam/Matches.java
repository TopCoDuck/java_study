package regex_exam;

public class Matches {

	public static void main(String[] args) {
		 String target = "나는 2008년도에 입학했다.";
		 String regEx = ".*\\d{1}.*";
		 
		 if (target.matches(regEx)) {
		        System.out.println("일치");
		 } else {
		        System.out.println("불일치");
		 }
	}

}
