
public class Person {
	String name;
	int age;
	
	public Person(String n, int a) {
		this.name=n;
		this.age=a;
	}
	public void speak() {
		if(age>=2) {
			System.out.println("안녕");
		}
		else {
			System.out.println("응애");
		}
	}
}
