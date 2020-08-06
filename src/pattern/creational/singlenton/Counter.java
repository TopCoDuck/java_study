package pattern.creational.singlenton;

public class Counter {
	
	private int count = 0;
	/**
	 * 직접 생성 못하게
	 */
	private Counter() {
		
	}

	public static Counter getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	/**
	 * 최초 호출 했을 때만 , 인스턴스를 생성하기 위하여
	 */
	private static class LazyHolder{
		public static final Counter INSTANCE = new Counter();
	}
	
	public  synchronized int getNextCount() {
		return ++count;
	}
	
}
