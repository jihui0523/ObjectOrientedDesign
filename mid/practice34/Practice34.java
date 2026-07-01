import java.util.Scanner;
public class Practice34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		
		System.out.println("첫번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력: ");
		r1.width=sc.nextInt();
		System.out.print("세로 입력: ");
		r1.height=sc.nextInt();
		
		System.out.println("두번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력: ");
		r2.width=sc.nextInt();
		System.out.print("세로 입력: ");
		r2.height=sc.nextInt();
		
		System.out.println();
		System.out.println("첫번째 사각형의 면적은 "+r1.width*r1.height+ "입니다.");
		System.out.println("첫번째 사각형의 둘레는 "+(r1.width+r1.height)*2+ "입니다.");
		System.out.println("두번째 사각형의 면적은 "+r2.width*r2.height+ "입니다.");
		System.out.println("두번째 사각형의 둘레는 "+(r2.width+r2.height)*2+ "입니다.");
		
		sc.close();
	}

}
