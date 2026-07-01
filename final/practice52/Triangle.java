import java.util.Random;
public class Triangle extends Shape implements Drawable{
	Random rd=new Random();
	
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
		return "중심좌표: ("+x+", "+y+"), 밑변: "+base+", 높이: "+height+", 면적: "+calcArea();
	}
	
	public void move() {
		x=rd.nextInt(100);
		y=rd.nextInt(100);
		base=(double) rd.nextInt(101);  
		height=(double) rd.nextInt(101);  
		System.out.println("중심좌표: (" + x + ", " + y + "), 밑변: " +
		String.format("%.1f", base) + ", 높이: " + String.format("%.1f", height)+", 면적: "+calcArea());
	}
	
	public void draw() {
		System.out.println("삼각형, " + toString());
	}
}
