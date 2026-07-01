
public class Shape {
	public int x,y;
	
	public Shape() {
		x=0;
		y=0;
	}
	
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public double calcArea() {
		return -1;
	}
	
	public String toString() {
		return "중심좌표: ("+x+", "+y+")";
	}
}
