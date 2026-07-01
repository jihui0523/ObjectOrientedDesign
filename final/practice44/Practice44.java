
public class Practice44 {

	public static void main(String[] args) {
		// Shape 타입의 배열 선언 : 크기 3
		 Shape[] sArray = new Shape[3];
		 sArray[0] = new Shape();
		 sArray[1] = new Rectangle();
		 sArray[2] = new Triangle();
		 
		 System.out.println(sArray[0] instanceof Shape);
		 //sArray[0]가 Shape 객체이므로 참
		 System.out.println(sArray[0] instanceof Rectangle);
		 //Shape 객체는 Rectangle의 하위 클래스가 아니므로 거짓
		 System.out.println(sArray[0] instanceof Triangle);
		 //Shape 객체는 Triangle의 하위 클래스가 아니므로 거짓
		 System.out.println(sArray[1] instanceof Shape);
		 //Rectangle은 Shape를 상속받았으므로 참
		 System.out.println(sArray[1] instanceof Rectangle);
		 //sArray[1]은 Rectangle 객체이므로 참
		 System.out.println(sArray[1] instanceof Triangle);
		 //Rectangle은 Triangle의 하위클래스가 아니고 sArray[1]이 Triangle 객체도 아니므로 거짓
		 System.out.println(sArray[2] instanceof Shape);
		 //Triangle은 Shape의 하위 클래스이므로 참
		 System.out.println(sArray[2] instanceof Rectangle);
		 //Rectangle은 Triangle의 하위클래스가 아니고 sArray[2]이 Rectangle 객체도 아니므로 거짓
		 System.out.println(sArray[2] instanceof Triangle);
		 //sArray[2]은 Triangle 객체이므로 참

	}

}
