package pattern.structural.proxy;

public class ProxyImageLoader implements Image{
	private String filename;
	private ImageLoader image;
	
	public ProxyImageLoader(String filename) {
	    this.filename = filename;
	}
	
	@Override
	public void displayImage() {
	    if (image == null)
	       image = new ImageLoader(filename);
	
	    image.displayImage();
	}

}
