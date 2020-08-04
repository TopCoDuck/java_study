package enum_exam;

public enum Enum_Extend {
	
	API(9),
	SESSION(10);
	
	int code;
	
	Enum_Extend(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
