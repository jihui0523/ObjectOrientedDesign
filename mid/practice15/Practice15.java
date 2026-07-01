import java.util.Random;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String pc;
		if(rd.nextInt(3)==1) {
			pc = "가위";
		}
		else if(rd.nextInt(3)==2){
			pc = "바위";
		}
		else {
			pc = "보";
		}
		
		System.out.println("컴퓨터의 생성: " + pc);
		
		String a;
		while(true) {
			System.out.print("당신의 입력: ");
			a = sc.next();
			
			if(a.equals("가위") || a.equals("바위") ||a.equals("보")) {
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
		
		if(whoswin(pc,a)==0) {
			System.out.println("비겼습니다.");
		}
		else if(whoswin(pc,a)==1){
			System.out.println("당신이 이겼습니다.");
		}
		else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		sc.close();

	}
	public static int whoswin(String com, String you) {
		if(you.equals(com)) {
			return 0;
		}
		else if(you.equals("가위")&&com.equals("보") || you.equals("바위")&&com.equals("가위") || you.equals("보")&&com.equals("바위")){
			return 1;
		}
		else {
			return -1;
		}
	}

}
