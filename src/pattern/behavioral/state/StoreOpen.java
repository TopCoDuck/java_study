package pattern.behavioral.state;

public class StoreOpen extends StoreState{

	@Override
	public boolean isOrderable() {
		return isOpen;
	}

}
