package pattern.structural.decorator;

public class Cream  extends Beverage{
	Beverage beverage;
	 
	public Cream(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

	@Override
	public int cost() {
		return beverage.cost()+500;
	}

}
