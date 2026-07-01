
public class Practice46A {

	public static void main(String[] args) {
		Student[] arr = new Student[3];
		
		arr[0] = new Student(1111, 100, 3.2);
		arr[1] = new UndergraduateStudent(2222, 100, 4.1, 3); 
		arr[2] = new GraduateStudent(3333, 100, 3.4, "SE"); 
		
		printAll(arr);
	}
	
	public static void printAll(Student[] s) {
		for(Student std : s) {
			System.out.println(std.toString());
		}
	}
}