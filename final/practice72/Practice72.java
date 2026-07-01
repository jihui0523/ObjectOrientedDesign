import java.util.HashSet;
import java.util.Random;
public class Practice72 {

	public static void main(String[] args) {
		Random rd=new Random();
		
		for (int i = 0; i < 10; i++) {
            HashSet<Integer> list = new HashSet<>();

            while (list.size() < 5) {
                list.add(rd.nextInt(90) + 10);
            }

            System.out.println("(" + (i + 1) + "회) " + list);
        }
	}
}