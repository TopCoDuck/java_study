package access_modifier.node;

public class NodeClassSamePackage {
	
	NodeClass n = new NodeClass();
	public void access_test() {
		System.out.println(n.protected_p);
		System.out.println(n.none_p);
		System.out.println(n.public_p);
	}
}
