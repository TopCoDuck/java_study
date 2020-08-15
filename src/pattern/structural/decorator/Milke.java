package pattern.structural.decorator;

public class Milke extends Beverage{
	Beverage beverage;
	 
	public Milke(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

	@Override
	public int cost() {
		return beverage.cost()+200;
	}

}
