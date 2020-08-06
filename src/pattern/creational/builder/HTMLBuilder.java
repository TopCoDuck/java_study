package pattern.creational.builder;

import java.util.List;

public class HTMLBuilder extends Builder{

	private String title;
	private List<String> items;
 	@Override
	public void makeTitle(String title) {
		this.title = title;
		
	}

	@Override
	public void makeList(List<String> items) {
		this.items = items;
	}

	@Override
	public void build() {
		StringBuffer sb = new StringBuffer();
		// TODO Auto-generated method stub

		sb.append("<html>");
		sb.append(String.format("<head><title>%s</title><head>", title));
		sb.append("<body>");
		sb.append("<ul>");
		items.stream()
			.forEach(item->sb.append("<li>"+item+"</li>"));
		sb.append("</ul>");
		
		sb.append("</body>");
		sb.append("</html>");
		
		System.out.println(sb);
	}
	
	

}
