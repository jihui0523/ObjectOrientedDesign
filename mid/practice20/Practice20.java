import java.util.Random;
import java.util.Scanner;
public class Practice20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] arr = new int[3];
		int count1=0,count2=0;
		int n;
		
		for(int i =0 ;i<3;i++) {
			arr[i]=rd.nextInt(9)+1;
		}
		printArray(arr);
		
		for(int i =0 ;i<3;i++) {
			System.out.print(i+"번째 숫자 입력: ");
			n=sc.nextInt();
			
			if(arr[i] == n) {
				count1++;
			}
			else if(searchArray(arr,n)!=-1) {
				count2++;
			}
		}
		
		System.out.println("자리와 값이 모두 같은 숫자: " + count1 +"개");
		System.out.print("자리는 다르고 값만 같은 숫자: " + count2 +"개");
		
		sc.close();
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
