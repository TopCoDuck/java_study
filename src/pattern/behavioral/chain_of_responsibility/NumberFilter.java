package pattern.behavioral.chain_of_responsibility;

public class NumberFilter extends CharFilter{

	@Override
	protected boolean check(char c) {
		return 48 <= c && c <=57;
	}

}
