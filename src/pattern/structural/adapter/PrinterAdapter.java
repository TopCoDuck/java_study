package pattern.structural.adapter;

public class PrinterAdapter implements Printer {
	
	private Printer printer;
	
	public PrinterAdapter(Printer printer) {
		this.printer = printer;
	}
	@Override
	public void print() {
		printer.print();
		System.out.println("flush");
	}

}
