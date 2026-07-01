import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
public class Practice74 {
	class ImproperArraySizeException extends RuntimeException {
	    public ImproperArraySizeException(String message) {
	        super(message);
	    }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RandomList<Integer> list =new RandomList<>();
		
		int func;
		System.out.println("정수형 RandomList를 생성합니다.");
		while(true) {
			System.out.print("원하는 기능을 선택하세요 (1-추가/2-출력/3-무작위/4-종료) :");
			func=sc.nextInt();
			
			if(func==1) {
				System.out.print("추가하고 싶은 원소의 개수를 입력하세요:");
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {
					System.out.print("["+i+"]번 원소: ");
					list.add(sc.nextInt());
				}
			}
			else if(func==2) {
				list.print();
			}
			else if(func==3) {
				System.out.println("무작위 원소 출력:"+list.select());
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}
class RandomList<T> {
    private ArrayList<T> list;  

    public RandomList() {
        list = new ArrayList<>();
    }

    public void add(T item) {
        list.add(item);
    }

    public T select() {
    	if (list == null || list.size() == 0) {
            throw new ImproperArraySizeException("입력된 원소가 없는 상태입니다.");
        }

        ArrayList<T> copy = new ArrayList<>(list); 
        Collections.shuffle(copy);                

        return copy.get(0);
    }

    public void print() {
        for (T item : list) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }
    
    private ArrayList<T> copyArray(){
    	 return new ArrayList<T>(list);
    }
}
class ImproperArraySizeException extends RuntimeException {
    public ImproperArraySizeException(String message) {
        super(message);
    }
}