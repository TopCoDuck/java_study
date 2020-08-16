package pattern.behavioral.state;

public class StoreClose extends StoreState{

	@Override
	public boolean isOrderable() {
		return isOpen;
	}

}
