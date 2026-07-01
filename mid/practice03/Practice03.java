import java.util.Scanner;
public class practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인치 값을 입력하세요.: ");
		double i = sc.nextDouble();
		
		double c = 2.54 * i;
		System.out.print("해당하는 센터미터 값은 " + (int)c + "입니다.");
		
		sc.close();
	}
}