package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Entry{
	private String name;
	private List<Entry> childEntrys = new ArrayList<Entry>();
	
	public Directory(String name) {
		super();
		this.name = name;
	}

	public void add(Entry entry) {
		this.childEntrys.add(entry);
	}
	@Override
	public String getName() {

		return name;
	}

	@Override
	public String getInfo() {

		return name;
	}

}
