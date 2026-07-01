import java.util.Scanner;
public class Practice11 {
	public static boolean isPrime(int a) {
		
		if(a < 2) {
			return false;
		}
		else {
			for(int i = 2; i < a; i++) {
				if(a % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		while(true) {
			System.out.print("숫자를 입력하세요.: ");
			n = sc.nextInt();
			
			if(n <= 0) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
			else {
				break;
			}
		}
		
		if(isPrime(n) == true) {
			System.out.print("입력된 숫자 " + n + "은 소수입니다.");
		}
		else {
			System.out.print("입력된 숫자 " + n + "은 소수가 아닙니다.");
		}
		
		sc.close();
	}
}