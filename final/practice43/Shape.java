
public abstract class Shape {
	/*class 앞에 abstract 붙여야 한다.*/
	protected int x,y;
	
	protected Shape() {
		x=0;
		y=0;
	}
	
	protected Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	protected abstract double calcArea();
	
	public String toString() {
        return "중심좌표: (" + x + ", " + y + ")";
    }
	/*접근 제어자 protected는 자식 클래스에서 접근이 가능하기 때문에 public를 유지할 필요가 없다. */
}
