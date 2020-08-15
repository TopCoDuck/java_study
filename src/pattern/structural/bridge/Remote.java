package pattern.structural.bridge;

public class Remote {
	
	protected Device device;
	
	public Remote(Device device) {
		this.device = device;
	}
	
	public void start() {
		device.on();
	}
	
	public void close() {
		device.off();
	}
}
