
public class Practice52 {

	public static void main(String[] args) {
		 Movable[] rArray = new Movable[2];
		 
		 rArray[0] = new Rectangle();
		 rArray[1] = new Triangle();
		 
		 System.out.println(rArray[0] instanceof Rectangle);//rArray[0]이 Rectangle의 객체니까
		 System.out.println(rArray[0] instanceof Triangle);//Rectangle과 Triangle은 상속 관계가 없으니까
		 System.out.println(rArray[0] instanceof Movable);//Rectangle이 Shape의 상속을 받고 Shape는 Movable을 구현했으니까
		 System.out.println(rArray[0] instanceof Drawable);//Rectangle이 Drawable을 구현했으니까
		 
		 System.out.println(rArray[1] instanceof Rectangle);//Rectangle과 Triangle은 상속 관계가 없으니까
		 System.out.println(rArray[1] instanceof Triangle);//rArray[1]이 Triangle의 객체니까
		 System.out.println(rArray[1] instanceof Movable);//Triangle이 Shape의 상속을 받고 Shape는 Movable을 구현했으니까
		 System.out.println(rArray[1] instanceof Drawable);//Triangle이 Drawable을 구현했으니까
	}

}
