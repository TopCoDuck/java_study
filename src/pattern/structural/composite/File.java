package pattern.structural.composite;

public class File implements Entry{
	private String name;
	private int size;
	
	public File(String name,int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	@Override
	public String getName() {

		return name;
	}

	@Override
	public String getInfo() {

		return name +  " " + size;
	}

}
