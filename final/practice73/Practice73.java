import java.util.*;
public class Practice73 {

	public static void main(String[] args) {
		HashSet<String> list=new HashSet<>();
		
		list.add("Bread");
		list.add("Milk");
		list.add("Butter");
		list.add("Ham");
		list.add("Cheese");
		
		System.out.println(list.toString());
		
		System.out.print("[");
		for(String a: list) {
			System.out.print(a+", ");
		}
		System.out.print("]");
		System.out.println();
		
		Iterator<String> it=list.iterator();
		System.out.print("[");
		while(it.hasNext()) {
			System.out.print(it.next()+", ");
		}
		System.out.print("]\n");

		int count=0;
		System.out.print("[");
		for(String a: list) {
			if(count<list.size()-1) {
				System.out.print(a+", ");
			}
			else {
				System.out.print(a);
			}
			count++;
		}
		System.out.print("]");
	}
}