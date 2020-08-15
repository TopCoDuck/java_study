package pattern.structural.bridge;

public class RemoteRestart extends Remote {
	
	public RemoteRestart(Device device) {
		super(device);
	}
	public void start() {
		device.off();
		device.on();
	}
}
