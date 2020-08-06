package enum_exam;

/**
 * 가위, 바위 , 보
 */
public enum PRS {

	  ROCK(0),
	  PAPRE(1),
	  SCISSORRS(2);
	
	  private int val;
	  
	  PRS(int val){
		  this.val = val;
	  }

	  /** R > P > S > R  경우의 수 3 X 3 = 9
	   * R - P = -1 패
	   * P - S = -1 패
	   * S - R = -2 패
	   * P - R  = 1 승
	   * S - P =  1 승
	   * R - S =  2 승
	   * 무승부
	   */
	  public int getScore(PRS otherRPS) {
		  if(this.val  == otherRPS.val) {
			  return 1;
		  }else if(this.val - otherRPS.val > 0 ) {
			  return 0;
		  }
		  return 2;
	  }
}
