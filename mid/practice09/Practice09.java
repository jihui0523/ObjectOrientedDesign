import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1, sum = 0;
				
		while(n != 0) {
			System.out.print("숫자를 입력하세요.: ");
			n = sc.nextInt();
			if(n < 0) {
				System.out.println("음수가 입력되었습니다. 다시 입력하세요. ");
				continue;
			}
			sum += n;
		}
		System.out.print("입력된 숫자들의 합은 " + sum + "입니다.");
		sc.close();
	}
}