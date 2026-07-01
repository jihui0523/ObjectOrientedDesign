import java.util.Scanner;
public class Practice31 {

	public static void main(String[] args) {
		Date d=new Date();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요: ");
		d.year=sc.nextInt();
		System.out.print("태어난 월을 입력하세요: ");
		d.month=sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		d.day=sc.nextInt();
		
		System.out.print("당신의 생일은 "+d.year+"년 "+d.month+"월 "+d.day+"일입니다.");
		sc.close();
	}

}
