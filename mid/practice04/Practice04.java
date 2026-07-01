import java.util.Scanner;
public class practice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를입력하세요.: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.print("입력한 정수 "+ n + "은 짝수입니다.");
		}
		else {
			System.out.print("입력한 정수 "+ n + "은 홀수입니다.");
		}
		
		sc.close();
	}
}