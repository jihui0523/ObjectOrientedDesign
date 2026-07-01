import java.util.Scanner;
public class Practice41 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student list[]=new Student[100];
		
		System.out.print("학생 숫자를 입력하세요:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			list[i]=new Student();
			System.out.println((i+1)+"번 학생의 정보:");
			System.out.print("이름: ");
			list[i].setName(sc.next());
			System.out.print("학번: ");
			list[i].setSid(sc.nextInt());
			System.out.print("전공: ");
			list[i].setMajor(sc.next());
		}
		
		System.out.println("입력된 학생의 정보입니다.");
		for(int i=0;i<n;i++) {
			System.out.println("["+(i+1)+"] "+ "이름: "+list[i].getName()+", 학번: "+list[i].getSid()+
								", 전공: "+list[i].getMajor());
		}
		
		for(int i=1;i<n;i++) {
			System.out.print("\""+ list[0].getName()+"\""+" 학생은 "+"\""+ list[i].getName()+"\""+" 학생과 ");
			
			if(list[0].equalsMajor(list[i])) {
				System.out.print("전공은 같고, ");
			}
			else {
				System.out.print("전공은 다르고, ");
			}
			
			if(list[0].isSenior(list[i])==-1) {
				System.out.println("학번은 빠릅니다.");
			}
			else if(list[0].isSenior(list[i])==1) {
				System.out.println("학번은 느립니다.");
			}
			else {
				System.out.println("학번은 같습니다.");
			}
		}
		sc.close();
	}
}
