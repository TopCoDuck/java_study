package pattern.structural.adapter;

public class OldPrinterImpl implements Printer {

	@Override
	public void print() {
		System.out.println("print");
		System.out.println("flush");
	}
}
