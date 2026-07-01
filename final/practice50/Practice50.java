import java.util.Scanner;

public class Practice50 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Shape s =new Shape();
		Rectangle r=new Rectangle();
		Triangle t =new Triangle();
		
		System.out.print("도형의 X좌표를 입력하세요.: ");
		s.x=sc.nextInt();
		System.out.print("도형의 Y좌표를 입력하세요.: ");
		s.y=sc.nextInt();
		System.out.println();
		
		System.out.print("사각형의 X좌표를 입력하세요.: ");
		r.x=sc.nextInt();
		System.out.print("사각형의 Y좌표를 입력하세요.: ");
		r.y=sc.nextInt();
		System.out.print("사각형의 가로를 입력하세요.: ");
		r.length=sc.nextInt();
		System.out.print("사각형의 세로를 입력하세요.: ");
		r.width=sc.nextInt();
		System.out.println();
		
		System.out.print("삼각형의 X좌표를 입력하세요.: ");
		t.x=sc.nextInt();
		System.out.print("삼각형의 Y좌표를 입력하세요.: ");
		t.y=sc.nextInt();
		System.out.print("삼각형의 밑변을 입력하세요.: ");
		t.base=sc.nextInt();
		System.out.print("삼각형의 높이를 입력하세요.: ");
		t.height=sc.nextInt();
		System.out.println();
		
		System.out.println("입력된 도형의 정보입니다.");
		System.out.println(s.toString());
		System.out.println("--이동후-");
		s.move();
		System.out.println();
		
		System.out.println("입력된 사각형의 정보입니다.");
		System.out.println(r.toString());
		System.out.println("--이동후-");
		r.move();
		System.out.println();
		
		System.out.println("입력된 삼각형의 정보입니다.");
		System.out.println(t.toString());
		System.out.println("--이동후-");
		t.move();
		System.out.println();
		
		sc.close();
	}
}