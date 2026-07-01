import java.util.Random;
import java.util.Scanner;
public class Practice19 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5];
		int count=0;
		
		while(true) {
			for(int i = 0; i < 5; i++) {
				arr[i]=rd.nextInt(101);
			}
			count++;
			printArray(arr);
			if(searchArray(arr,100)!=-1) {
				System.out.print(count + "차 실행에서 난수 100이 발생했으므로 프로그램을 종료합니다.");
				break;
			}
		}
	}
	public static int searchArray (int[] array, int key) {
		 for(int i = 0; i < array.length; i++) {
				if(array[i]==key) {
					return i;
				}
			}
		 return -1;
	 }
	 public static void printArray(int[] array) {
		 for(int i = 0; i < array.length; i++) {
				System.out.print(array[i]+ "\t");
			}
		 System.out.println();
	 }

}
