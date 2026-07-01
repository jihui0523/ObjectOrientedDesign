import java.util.Random;
import java.util.Scanner;
public class Practice16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String a;
		int win = 0, lose=0, draw=0;
		
		while(true) {
			
			System.out.println("현재 당신의 전적: " + win +"승 "+ lose +"패 " + draw +"무");
			
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
		
			System.out.println("컴퓨터의 입력: " + pc);
		
			while(true) {
				System.out.print("당신의 입력(가위/바위/보/그만): ");
				a = sc.next();
			
				if(a.equals("가위") || a.equals("바위") ||a.equals("보")) {
					break;
				}
				else if (a.equals("그만")) {
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return; 
                }
				else {
					System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				}
			}
		
			if(whoswin(pc,a)==0) {
				System.out.println("비겼습니다.");
				draw++;
			}
			else if(whoswin(pc,a)==1){
				System.out.println("당신이 이겼습니다.");
				win++;
			}
			else {
				System.out.println("컴퓨터가 이겼습니다.");
				lose++;
			}
		}

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
