package pattern.structural.bridge;

public class Radio implements Device{

	@Override
	public void on() {
		System.out.println("라디오 켜짐");
		
	}

	@Override
	public void off() {
		System.out.println("라디오 꺼짐");
	}

}
