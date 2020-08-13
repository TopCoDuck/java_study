package pattern.structural.adapter;

public class Using {
	private Printer printer;
	
	public Using(Printer printer) {
		this.printer = printer;
	}
	
	public void print() {
		printer.print();
	}
	
}
