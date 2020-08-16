package pattern.behavioral.state;

public abstract class StoreState {
	protected boolean isOpen;
	
	public abstract boolean isOrderable();
}
