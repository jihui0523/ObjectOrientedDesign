
public class Practice51 {

	public static void main(String[] args) {
		 Shape s = new Shape();
		 Rectangle r = new Rectangle();
		 Triangle t = new Triangle();
		 
		 System.out.println(s instanceof Shape);
		 System.out.println(s instanceof Rectangle);
		 System.out.println(s instanceof Triangle);
		 System.out.println(s instanceof Movable);
		 System.out.println(s instanceof Drawable);
		 System.out.println(r instanceof Shape);
		 System.out.println(r instanceof Rectangle);
		 //System.out.println(r instanceof Triangle); Rectangle과 Triangle은 상속 관계가 아니기 때문에 오류가 난다.
		 System.out.println(r instanceof Movable);
		 System.out.println(r instanceof Drawable);
		 System.out.println(t instanceof Shape);
		 //System.out.println(t instanceof Rectangle); Rectangle과 Triangle은 상속 관계가 아니기 때문에 오류가 난다.
		 System.out.println(t instanceof Triangle);
		 System.out.println(t instanceof Movable);
		 System.out.println(t instanceof Drawable);
	}
}