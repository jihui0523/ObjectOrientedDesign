
public class Practice48 {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		Person p1 = new Person("김동덕", 1);
		Person p2 = new Person("홍길동", 20);
		 
		speak3Times(myDog);
		speak3Times(p1);
		speak3Times(p2);
	}
	
	private static void speak3Times(Dog d)    {
		 for(int i=0;i<3;i++) {
			 d.speak();
		 }
			 
	}

	 private static void speak3Times(Person p) {  
		 for(int i=0;i<3;i++) {
			 p.speak();
		 }
	}
	 //매개변수를 Speakable Speakage s로 받는 메소드로 만든다.
}
