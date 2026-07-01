import java.util.Scanner;
public class Practice53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Shape[] figure=new Shape[3];
		
		System.out.print("도형의 X좌표를 입력하세요.: ");
		int sx=sc.nextInt();
		System.out.print("도형의 Y좌표를 입력하세요.: ");
		int sy=sc.nextInt();
		figure[0] = new Shape(sx, sy);
		System.out.println();
		
		System.out.print("사각형의 X좌표를 입력하세요.: ");
		int rx=sc.nextInt();
		System.out.print("사각형의 Y좌표를 입력하세요.: ");
		int ry=sc.nextInt();
		System.out.print("사각형의 가로를 입력하세요.: ");
		double rl=sc.nextInt();
		System.out.print("사각형의 세로를 입력하세요.: ");
		double rw=sc.nextInt();
		figure[1] = new Rectangle(rx, ry, rl, rw);
		System.out.println();
		
		System.out.print("삼각형의 X좌표를 입력하세요.: ");
		int tx=sc.nextInt();
		System.out.print("삼각형의 Y좌표를 입력하세요.: ");
		int ty=sc.nextInt();
		System.out.print("삼각형의 밑변을 입력하세요.: ");
		double tb=sc.nextInt();
		System.out.print("삼각형의 높이를 입력하세요.: ");
		double th=sc.nextInt();
		figure[2]=new Triangle(tx,ty,tb,th);
		System.out.println();
		
		System.out.println("입력된 도형의 정보입니다.");
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+": "+figure[i].toString());
		}
		System.out.println();
		
		System.out.println("--도형들을 이동합니다--");
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+": ");
			figure[i].move();
		}
		sc.close();
	}

}