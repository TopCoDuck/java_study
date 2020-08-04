package access_modifier;

import access_modifier.node.NodeClass;

public class RootClass {
	
	NodeClass n = new NodeClass();
	public void access_test() {
		System.out.println(n.public_p);
	}
}
