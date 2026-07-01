
public class Practice46B {

	public static void main(String[] args) {
		Student[] arr=new Student[3];
		
		arr[0]=new Student();
		arr[0].setId(1111);
		arr[0].setTuition(100);
		arr[0].setGpa(3.2);
		
		arr[1]=new UndergraduateStudent();
		arr[1].setId(2222);
		arr[1].setTuition(100);
		arr[1].setGpa(4.1);
		((UndergraduateStudent) arr[1]).setYear(3);
		
		arr[2]=new GraduateStudent();
		arr[2].setId(3333);
		arr[2].setTuition(100);
		arr[2].setGpa(3.4);
		((GraduateStudent) arr[2]).setLab("SE");

		printAll(arr);
	}
	
	public static void printAll(Student[] s) {
		for(Student std : s) {
			System.out.println(std.toString());
		}
	}
}