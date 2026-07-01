import java.util.Scanner;
public class Practice13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a;
		while(true) {
			System.out.print("철수의 입력: ");
			a = sc.next();
			
			if(a.equals("가위") || a.equals("바위") ||a.equals("보")) {
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
		
		String b;
		while(true) {
			System.out.print("영희의 입력: ");
			b = sc.next();
			
			if(b.equals("가위") || b.equals("바위") ||b.equals("보")) {
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
		
		if(a.equals(b)) {
			System.out.println("비겼습니다.");
		}
		else if(a.equals("가위")&&b.equals("보") || a.equals("바위")&&b.equals("가위") || a.equals("보")&&b.equals("바위")){
			System.out.println("철수가 이겼습니다.");
		}
		else {
			System.out.println("영희가 이겼습니다.");
		}
		sc.close();

	}

}
