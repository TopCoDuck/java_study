package pattern.behavioral.chain_of_responsibility;

public class AlbertFilter extends CharFilter{

	@Override
	protected boolean check(char c) {
		return (65 <= c && c <=90) || (97 <= c && c <=122);
	}

}
