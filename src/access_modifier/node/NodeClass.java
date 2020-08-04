package access_modifier.node;

public class NodeClass {
	
	private int private_p;
	protected int protected_p;
	int none_p;
	public int public_p;
	
	public void access_test() {
		System.out.println(private_p);
		System.out.println(protected_p);
		System.out.println(none_p);
		System.out.println(public_p);
	}
	
}
