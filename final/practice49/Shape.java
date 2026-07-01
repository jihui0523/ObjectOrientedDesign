import java.util.Random;
public class Shape implements Movable{
	Random rd=new Random();
	
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
	
	public void move() {
		x=rd.nextInt(100);
		y=rd.nextInt(100);
		System.out.println(toString());
	}
}
