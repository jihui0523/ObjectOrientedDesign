
public class Triangle extends Shape{
	public double base;
	public double height;
	
	public Triangle() {
		super();
		base=0;
		height=0;
	}
	
	public Triangle(int x, int y, double base) {
		super(x,y);
		this.base=base;
		height=0;
	}
	
	public Triangle(int x,int y,double base, double height) {
		super(x,y);
		this.base=base;
		this.height=height;
	}
	
	public double calcArea() {
		return base*height/2;
	}
	
	public String toString() {
		return super.toString()+", 밑변: "+base+", 높이: "+height+", 면적: "+calcArea();
	}
}
