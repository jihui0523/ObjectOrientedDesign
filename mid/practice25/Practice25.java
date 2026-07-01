
public class Practice25 {

	public static void main(String[] args) {
		Date d1=new Date();
		Date d2=new Date();

		d1.setYear(2010);
		d1.setMonth(8);
		d1.setDay(31);

		d2.setYear(1998);
		d2.setMonth(9);
		d2.setDay(15);
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}
}