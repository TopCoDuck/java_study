package pattern.structural.proxy;

public class ImageLoader implements Image{
	
	private String filename;
	public ImageLoader(String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}
	
	private void loadImageFromDisk() {
		System.out.println("Loading   " + filename);
	}
	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		
	}

}
