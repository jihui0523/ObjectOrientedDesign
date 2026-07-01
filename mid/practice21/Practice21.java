import java.util.Random;
public class Practice21 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i]=rd.nextInt(101);
		}
		
		for(int Rd : arr) {
			System.out.print(Rd+ "\t");
		}
		
		System.out.println();
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[9-i]+ "\t");
		}
		
		for(int Rd : arr) {
			sum+=Rd;
		}
		
		System.out.println();
		System.out.println("난수들의 총합: " + sum);
		System.out.println("난수들의 평균: " + (double)sum/arr.length);

	}

}
