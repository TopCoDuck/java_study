package pattern.creational.singlenton;

public class CounterOldSinglenton {
	private static CounterOldSinglenton instance;
	private int count = 0;
	/**
	 * 직접 생성 못하게
	 */
	private CounterOldSinglenton() {
		
	}

	public static synchronized  CounterOldSinglenton getInstance() {
		if(instance == null) {
			instance = new CounterOldSinglenton();
		}
		return instance;
	}
	
	
	public  synchronized int getNextCount() {
		return ++count;
	}
}
