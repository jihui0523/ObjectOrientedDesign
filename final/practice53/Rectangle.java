import java.util.Random;
public class Rectangle extends Shape implements Drawable{
	Random rd=new Random();
	
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
		return "사각형, 중심좌표: ("+x+", "+y+"), 가로: "+width+", 세로: "+length+", 면적: "+calcArea();
	}
	
	public void move() {
		x=rd.nextInt(100);
		y=rd.nextInt(100);
		width = (double) rd.nextInt(101);   
	    length = (double) rd.nextInt(101);
		System.out.println("사각형, 중심좌표: (" + x + ", " + y + "), 밑변: " +
		String.format("%.1f", width) + ", 높이: " + String.format("%.1f", length)+", 면적: "+calcArea());
	}
	
	public void draw() {
		System.out.println("사각형, " + toString());
	}
}
