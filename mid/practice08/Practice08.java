import java.util.Random;
public class Practice08 {
	public static void main(String[] args) {
		Random rg = new Random();
	    
        for(int i = 0; i < 10; i++) {
            System.out.print((rg.nextInt(99)+1) + "\t");
        }
	}
}