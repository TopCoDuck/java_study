package pattern.behavioral.strategy;

public class Unit {
	private int hp;
	private int mp;
	private Move moveStrategy;
	
	public Unit(int hp, int mp, Move moveStrategy) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.moveStrategy = moveStrategy;
	}

	public void move() {
		moveStrategy.move();
	}
}
