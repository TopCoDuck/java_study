package pattern.creational.prototype;

public  class Circle{
	private int x;
	private int y;
	private int radius;
	///....... 그외 경계선 두께, 색깔등 프로퍼티 정보 
	public Circle() {
		
	}
	
	public Circle(Circle shape) {
	   this.x = shape.x;
	   this.y = shape.y;
	   this.radius = shape.radius;
		///....... 그외 경계선 두께, 색깔등 프로퍼티 정보 대입
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	///....... 그외 경계선 두께, 색깔등 setter, getter
    public  Circle copy(int x, int y) {
    	Circle copy = new Circle(this);
    	copy.setX(x);
    	copy.setY(y);
    	return copy;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append(", radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString();
	}
    
    
}
