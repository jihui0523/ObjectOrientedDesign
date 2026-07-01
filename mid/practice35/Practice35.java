
public class Practice35 {

	public static void main(String[] args) {
		BankAccount a1=new BankAccount();
		BankAccount a2=new BankAccount();
		
		a1.name="김상식";
		a1.accoutNo="1234-5678";
		a1.balance=100;
		a1.rate=0.0;
		
		a2.name="홍길동";
		a2.accoutNo="9999-2531";
		a2.balance=2000;
		a2.rate=2.15;
		
		System.out.println ("첫번째 은행 계좌의 정보입니다.");
		System.out.println("이름: "+a1.name);
		System.out.println("계좌번호: "+a1.accoutNo);
		System.out.println("잔액: "+a1.balance+"원");
		System.out.println("이자율: "+a1.rate+"%");
		System.out.println();
		
		System.out.println("두번째 은행 계좌의 정보입니다.");
		System.out.println("이름: "+a2.name);
		System.out.println("계좌번호: "+a2.accoutNo);
		System.out.println("잔액: "+a2.balance+"원");
		System.out.println("이자율: "+a2.rate+"%");

	}

}
