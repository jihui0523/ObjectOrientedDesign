import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
				
		while(true) {
			System.out.print("정수를 입력하세요.: ");
			n = sc.nextInt();
			if(n <= 0) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요. ");
			}
			else {
				break;
			}
		}
		
		int count = 0;
		
		for(int i = 0; i <= n; i++) {
			if(i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
			}
			if(count % 7 == 0) {
				System.out.println();
			}
		}
		
		sc.close();
	}
}