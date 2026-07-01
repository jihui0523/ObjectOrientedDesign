import java.util.Scanner;
public class Practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.: ");
		int n = sc.nextInt();
		
		if(n < 0) {
			System.out.print("입력한 정수의 절대값은 " + -n + "입니다.");
		}
		else {
			System.out.print("입력한 정수의 절대값은 " + n + "입니다.");
		}
		sc.close();
	}
}