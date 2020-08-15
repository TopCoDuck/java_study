package pattern.structural.flyweight;

public abstract class  RPS {
	
	private char[][] display;
	private int code;
	
	public RPS(int code ,char[][] display){
		this.code = code;
		this.display = display;
	}
	public  int getCode() {
		return code;
	}
	
	public  void getDisplay() {
		System.out.println("화면 출력");
	}
}
