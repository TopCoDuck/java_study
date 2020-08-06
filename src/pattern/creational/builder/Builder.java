package pattern.creational.builder;

import java.util.List;

public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makeList(List<String> items);
	public abstract void build();
}
