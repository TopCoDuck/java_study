package pattern.creational.builder;

import java.util.List;

public class TextBuilder extends Builder{
	
	StringBuffer sb = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		sb.append(title+"\n");
	}

	@Override
	public void makeList(List<String> items) {
		// TODO Auto-generated method stub
		items.stream()
		.forEach(item->sb.append(" * "+item+"\n"));
		
	}

	@Override
	public void build() {
		System.out.println(sb);
	}

}
