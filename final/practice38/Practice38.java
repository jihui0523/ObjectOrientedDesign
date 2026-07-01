import java.util.Scanner;
public class Practice38 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Date d1=new Date();
		Date d2=new Date();
		
		System.out.println("첫번째 날짜를 입력하세요.");
		System.out.print("년도:");
		d1.setYear(sc.nextInt());
		System.out.print("월:");
		d1.setMonth(sc.nextInt());
		System.out.print("일:");
		d1.setDay(sc.nextInt());

		System.out.println("두번째 날짜를 입력하세요.");
		System.out.print("년도:");
		d2.setYear(sc.nextInt());
		System.out.print("월:");
		d2.setMonth(sc.nextInt());
		System.out.print("일:");
		d2.setDay(sc.nextInt());
		
		int result = Date.compareDate(d1, d2);
		
		if(result==-1) {
			System.out.println("첫 번째 날짜인 "+d1.toString()+"이 이른 날짜입니다.");
		}
		else if(result==1) {
			System.out.println("두 번째 날짜인 "+d2.toString()+"이 이른 날짜입니다.");
		}
		else if(result==0) {
			System.out.println("두 날짜는 같은 날짜입니다.");
		}
		
		sc.close();
	}
}