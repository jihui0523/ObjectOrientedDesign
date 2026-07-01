import java.util.Scanner;
public class Practice39 {

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
		
		Date earlist = dataList[0];
		int index = 0;
		
		for(int i=1;i<5;i++) {
			if(Date.compareDate(dataList[i],earlist)==-1) {
				earlist=dataList[i];
				index=i;
			}
		}
		System.out.print("가장 빠른 날짜는 "+(index+1)+"번째 입력된 "+earlist.toString()+"일입니다.");
		
		sc.close();
	}

}
