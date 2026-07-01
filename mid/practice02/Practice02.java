import java.util.Scanner;
public class practice02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력하세요.: ");
		int h = sc.nextInt();
		
		double c = (5.0 / 9.0) * ((double)h - 32.0);
		System.out.print("해당하는 섭씨 온도는 " + c + "입니다.");
		
		sc.close();
	}
}