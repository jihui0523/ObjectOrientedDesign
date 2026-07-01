import java.util.Scanner;

public class Practice37 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Date dataList[]=new Date[5];
		
		for(int i=0;i<5;i++) {
			dataList[i] = new Date();
			System.out.println((i+1)+"번째 날짜를 입력하세요.");
			System.out.print("년도:");
			dataList[i].setYear(sc.nextInt());
			System.out.print("월:");
			dataList[i].setMonth(sc.nextInt());
			System.out.print("일:");
			dataList[i].setDay(sc.nextInt());
		}
		
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번째 날짜는 "+dataList[i].getYear()+"년 "+
			dataList[i].getMonth()+"월 "+dataList[i].getDay()+"일입니다.");
		}
		
		sc.close();
	}
}