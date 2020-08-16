package pattern.behavioral.state;

public class StoreScheduledEntry extends StoreState{

	@Override
	public boolean isOrderable() {
		return false;
	}

}
