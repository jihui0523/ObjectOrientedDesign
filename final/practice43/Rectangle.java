
public class Rectangle extends Shape{
	public double length;
	public double width;
	
	public Rectangle() {
		super();
		length=0;
		width=0;
	}
	
	public Rectangle(int x,int y,double length) {
		super(x,y);
		this.length=length;
		width=0;
	}
	
	public Rectangle(int x,int y,double length, double width) {
		super(x,y);
		this.length=length;
		this.width=width;
	}
	
	public double calcArea() {
		return length * width;
	}
	
	public String toString() {
		return super.toString()+", 가로: "+width+", 세로: "+length+", 면적: "+calcArea();
	}
}
