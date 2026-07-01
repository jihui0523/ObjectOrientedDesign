import java.util.Random;
import java.util.Scanner;
public class Practice22 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			arr[i]=rd.nextInt(101);
		}
		
		printArray(arr);
		
		System.out.print("찾고 싶은 숫자를 입력하세요.: ");
		int n = sc.nextInt();
		
		if(searchArray(arr,n)==-1) {
			System.out.print("입력한 숫자 "+n+"는 배열에 없습니다.");
		}
		else {
			System.out.print("입력한 숫자 "+n+"는 배열의 " +searchArray(arr,n)+"번째 자리에 있습니다.");
		}
		
		sc.close();

	}
	 public static int searchArray (int[] array, int key) {
		 int count = 0;
		 
		 for(int arr : array) {
				if(arr==key) {
					return count;
				}
				count++;
			}
		 return -1;
	 }
	 public static void printArray(int[] array) {
		 for(int arr : array) {
				System.out.print(arr+ "\t");
			}
		 System.out.println();
	 }

}
