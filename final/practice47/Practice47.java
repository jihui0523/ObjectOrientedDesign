import java.util.Scanner;
public class Practice47 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount[] a =new BankAccount[3];
		
		a[0]=new BankAccount();
		a[1]=new BankAccount();
		a[2]=new BankAccount();
		
		for(int i=0;i<a.length;i++) {
			System.out.print("예금주 이름을 입력하세요: ");
			a[i].setOwner(sc.next());
			System.out.print("잔고를 입력하세요: ");
			a[i].setBalance(sc.nextInt());
		}
		System.out.println("현재 잔고 현황입니다.");
		System.out.println("계좌번호		계좌주		잔고");
		for(int i=0;i<a.length;i++) {
			System.out.println((i+1)+a[i].toString());
		}
		
		int check1 = 4, check2;
		while(true) {
			System.out.print("업데이트할 계좌번호를 입력하세요(종료-0): ");
			check1=sc.nextInt();
			if (check1 == 0) {
			    break;  
			}
			System.out.print("원하는 작업을 선택하세요(1-입금/2-출금): ");
			check2=sc.nextInt();
			
			if(check2==1) {
				System.out.print("입금액을 입력하세요: ");
				a[check1-1].deposit(sc.nextInt());
				
			}
			else {
				System.out.print("출금액을 입력하세요: ");
				a[check1-1].withdraw(sc.nextInt());
			}
			
			System.out.println("현재 잔고 현황입니다.");
			System.out.println("계좌번호		계좌주		잔고");
			for(int i=0;i<a.length;i++) {
				System.out.println((i+1)+a[i].toString());
			}
		}

		System.out.print("프로그램을 종료합니다.");
		sc.close();
	}
}